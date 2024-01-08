//Binary-Search-Tree

import java.util.*;



public class BST 
{

  class Node 
  {

    int data;
    Node left;
    Node right;

    Node(int data)
    {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  Node root;
  Scanner sc = new Scanner(System.in);
  static Hashtable<Integer, Integer> a1;
  static int max = 0;
  static int choice;

  public void clear() 
  {
    root = null;
  }

  public void add(int data) 
  {
    root = insert(root, data);
  }

  public Node insert(Node root, int data) 
  {
    if (root == null) 
    {
      root = new Node(data);
      return root;
    } 
    else 
    {
      if (root.data > data) 
      {
        root.left = insert(root.left, data);
      } 
      else if (root.data < data) 
      {
        root.right = insert(root.right, data);
      }
      return root;
    }
  }

  public void operation() 
  {
    boolean flag = false;
    do 
    {
      boolean f3 = true;
      while (f3) 
      {
        System.out.println();
        System.out.println(
          "                  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |                   * OPERATIONS *                    |"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |               Press 1. To Insert Data                 |"
        );
        System.out.println(
          "                 |               Press 2. To Delete Data                 |"
        );
        System.out.println(
          "                 |               Press 3. To Search Data                 |"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|"
        );
        System.out.println();
        System.out.println();
        System.out.print("                 Enter Your Choice : ");
        int i = sc.nextInt();
        System.out.println();
        switch (i) 
        {
          case 1:
            {
              insert_data();
              f3 = false;
              break;
            }
          case 2:
            {
              if (choice == 1) 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.print(
                  "                 Enter The Element To Delete : "
                );
                int element = sc.nextInt();
                boolean ans = search_data(root, element);
                if (ans) 
                {
                  delete(root, element);
                } 
                else 
                {
                  System.out.println();
                  System.out.println(
                    "                 The Data " +
                    element +
                    " You Entered Is Not Present In BST"
                  );
                }
                max--;
              } 
              else if (choice == 2) 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.print(
                  "                 Enter The Character To Delete : "
                );
                char c2 = sc.next().charAt(0);
                int j = c2 - '0';
                System.out.println();
                boolean ans = search_data(root, j);
                if (ans) 
                {
                  delete(root, j);
                } 
                else 
                {
                  System.out.println();
                  System.out.println(
                    "                 The Data " +
                    j +
                    " You Entered Is Not Present In BST"
                  );
                }
                delete(root, j);
                max--;
              }
              f3 = false;
              break;
            }
          case 3:
            {
              if (choice == 1) 
              {
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.print(
                  "                 Enter Data You Want To Search : "
                );
                int element = sc.nextInt();
                System.out.println();
                boolean ans = search_data(root, element);
                if (ans) 
                {
                  System.out.println(
                    "                 The Data " +
                    element +
                    " You Entered Is Present In BST"
                  );
                } 
                else 
                {
                  System.out.println(
                    "                 The Data " +
                    element +
                    " You Entered Is Not Present In BST"
                  );
                }
                f3 = false;
                break;
              } 
              else if (choice == 2) 
              {
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.print(
                  "                 Enter Data You Want To Search : "
                );
                char q = sc.next().charAt(0);
                int element = (char) q - '0';
                System.out.println();
                boolean ans = search_data(root, element);
                element = element + '0';
                if (ans) 
                {
                  System.out.println(
                    "                 The Data " +
                    (char) element +
                    " You Entered Is Present In BST"
                  );
                } 
                else 
                {
                  System.out.println(
                    "                 The Data " +
                    (char) element +
                    " You Entered Is Not Present In BST"
                  );
                }
                f3 = false;
                break;
              }
            }
          default:
            {
              System.out.println();
              System.out.println("                 Invalid Choice    ");
            }
        }
      }
      System.out.println();
      boolean f2 = true;
      while (f2) 
      {
        System.out.println(
          "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
        );
        System.out.println();
        System.out.println(
          "                 Do You Want Countine To Do Operation...?"
        );
        System.out.println();
        System.out.println("                 Press 1. Yes  ");
        System.out.println("                 Press 2. No   ");
        System.out.println();
        System.out.print("                 Enter Your Choice : ");
        int number = sc.nextInt();
        if (number == 1) 
        {
          flag = true;
          f2 = false;
        } 
        else if (number == 2) 
        {
          flag = false;
          f2 = false;
        } 
        else 
        {
          System.out.println();
          System.out.println("                 Invalid Choice    ");
        }
      }
    } while (flag);
  }

  public void insert_data() 
  {
    if (choice == 1) 
    {
      System.out.println(
        "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
      );
      System.out.println();
      System.out.print("                 Enter Node Data To Insert : ");
      int n = sc.nextInt();
      max++;
      add(n);
    } 
    else 
    {
      System.out.println(
        "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
      );
      System.out.println();
      System.out.print("                Enter Node Data To Insert : ");
      char a = sc.next().charAt(0);
      int n = (char) a - '0';
      max++;
      add(n);
    }
  }

  public boolean search_data(Node root, int element) 
  {
    if (root == null) 
    {
      return false;
    }
    if (root.data == element) 
    {
      return true;
    } 
    else if (root.data < element) 
    {
      return search_data(root.right, element);
    } 
    else 
    {
      return search_data(root.left, element);
    }
  }

  public static Node delete(Node root, int data) 
  {
    if (root == null) 
    {
      return root;
    }
    if (data < root.data) 
    {
      root.left = delete(root.left, data);
    } 
    else if (data > root.data) 
    {
      root.right = delete(root.right, data);
    } 
    else 
    {
      if (root.left == null) 
      {
        return root.right;
      } 
      else if (root.right == null) 
      {
        return root.left;
      }
      root.data = findMin(root.right);                    //delete from successor
      root.right = delete(root.right, root.data);
    }
    return root;
  }

  public void storeIntoArrayStartingWithZero(
    Node root,
    Hashtable<Integer, Integer> a1,
    int i
  ) 
  {
    if (choice == 1) 
    {
      if (root == null) 
      {
        return;
      }
      storeIntoArrayStartingWithZero(root.left, a1, 2 * i + 1); 
      a1.put(i, root.data);
      storeIntoArrayStartingWithZero(root.right, a1, 2 * i + 2);
    } 
    else if (choice == 2) 
    {
      if (root == null) 
      {
        return;
      }
      storeIntoArrayStartingWithZero(root.left, a1, 2 * i + 1);
      a1.put(i, root.data);
      storeIntoArrayStartingWithZero(root.right, a1, 2 * i + 2);
    }
  }

  public void storeIntoArrayStartingWithOne(
    Node root,
    Hashtable<Integer, Integer> a1,
    int i
  ) 
  {
    if (choice == 1) 
    {
      if (root == null) 
      {
        return;
      }
      storeIntoArrayStartingWithOne(root.left, a1, 2 * i);
      a1.put(i, root.data);
      storeIntoArrayStartingWithOne(root.right, a1, 2 * i + 1);
    } 
    else if (choice == 2) 
    {
      if (root == null) 
      {
        return;
      }
      storeIntoArrayStartingWithOne(root.left, a1, 2 * i + 1);
      a1.put(i, root.data);
      storeIntoArrayStartingWithOne(root.right, a1, 2 * i + 2);
    }
  }

  public void Traversal() 
  {
    boolean f = true;
    while (f) 
    {
      System.out.println();
      System.out.println(
        "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
      );
      System.out.println();
      System.out.println(
        "                 Do You Want Postorder And Inorder Of BST...?"
      );
      System.out.println();
      System.out.println("                 Press 1. Yes");
      System.out.println("                 Press 2. No");
      System.out.println();
      System.out.print("                 Enter Your Choice : ");
      int yes = sc.nextInt();
      if (yes == 1) 
      {
        System.out.println();
        System.out.println(
          "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
        );
        System.out.println();
        System.out.print("                 POSTORDER : ");
        postOrder(root);
        System.out.println();
        System.out.println();
        System.out.print("                 INORDER   : ");
        inorder(root);
        System.out.println();
        f = false;
      } 
      else if (yes == 2) 
      {
        f = false;
      } 
      else 
      {
        System.out.println();
        System.out.println("                 Invalid Choice    ");
      }
    }
  }

  public void postOrder(Node root) 
  {
    if (choice == 1) 
    {
      if (root == null) 
      {
        return;
      }
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
    } 
    else if (choice == 2) 
    {
      if (root == null) 
      {
        return;
      }
      postOrder(root.left);
      postOrder(root.right);
      root.data = root.data + '0';
      System.out.print((char) root.data + " ");
    }
  }

  public void inorder(Node root) 
  {
    if (choice == 1) 
    {
      if (root == null) 
      {
        return;
      }
      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    } 
    else if (choice == 2) 
    {
      if (root == null) 
      {
        return;
      }
      inorder(root.left);
      System.out.print((char) root.data + " ");
      inorder(root.right);
    }
  }


  public void Question() 
  {
    boolean flag = false;
    do 
    {
      boolean f3 = true;
      while (f3) 
      {
        System.out.println();
        System.out.println(
          "                  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |                  * QUESTIONS *                      |"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |      Press 1. What Is The Height Of BST               |"
        );
        System.out.println(
          "                 |      Press 2. What Is The Maximun Node In BST         |"
        );
        System.out.println(
          "                 |      Press 3. What Is The Minimun Node In BST         |"
        );
        System.out.println(
          "                 |      Press 4. How Many Leaf Node Are There In BST     |"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|"
        );
        System.out.println();
        System.out.println();
        System.out.print("                 Enter Your Choice : ");
        int i = sc.nextInt();
        System.out.println();
        switch (i) 
        {
          case 1:
            {
              System.out.println();
              System.out.println(
                "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
              );
              System.out.println();
              System.out.println(
                "                 Height Of The BST : " + height(root)
              );
              System.out.println();
              f3 = false;
              break;
            }
          case 2:
            {
              if (choice == 1) 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.println(
                  "                 Maximun Node In BST : " + findMax(root)
                );
                System.out.println();
              } 
              else if (choice == 2) 
              {
                int q = (int) findMax(root) + '0';
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.println(
                  "                 Maximun Node In BST : " + (char) q
                );
                System.out.println();
              }
              f3 = false;
              break;
            }
          case 3:
            {
              if (choice == 1) 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.println(
                  "                 Minimum Node In BST : " + findMin(root)
                );
                System.out.println();
              } 
              else if (choice == 2) 
              {
                int q = (int) findMin(root) + '0';
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.println(
                  "                 Minimum Node In BST : " + (char) q
                );
                System.out.println();
              }
              f3 = false;
              break;
            }
          case 4:
            {
              System.out.println();
              System.out.println(
                "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
              );
              System.out.println();
              System.out.println(
                "                 Total Number Of Leaf Node In The BST : " +
                findLeafNodes(root)
              );
              System.out.println();
              f3 = false;
              break;
            }
          default:
            {
              System.out.println();
              System.out.println("                 Invalid Choice    ");
            }
        }

        //System.out.println();
        boolean f2 = true;
        while (f2) 
        {
          System.out.println(
            "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
          );
          System.out.println();
          System.out.println(
            "                 Do You Want Countine To Aks Questions...?"
          );
          System.out.println();
          System.out.println("                 Press 1. Yes  ");
          System.out.println("                 Press 2. No   ");
          System.out.println();
          System.out.print("                 Enter Your Choice : ");
          int number = sc.nextInt();
          if (number == 1) 
          {
            flag = true;
            f2 = false;
          } 
          else if (number == 2) 
          {
            flag = false;
            f2 = false;
          } 
          else 
          {
            System.out.println();
            System.out.println("                 Invalid Choice    ");
          }
        }
      }
    } while (flag);
  }

  public static int findMax(Node root) 
  {
    if (root == null) 
    {
      return -1;
    }
    while (root.right != null) 
    {
      root = root.right;
    }
    return root.data;
  }

  public static int height(Node root) 
  {
    if (root == null) 
    {
      return -1;
    }
    int leftHeight = height(root.left);
    int RightHeight = height(root.right);
    return Math.max(leftHeight, RightHeight) + 1;
  }

  public static int findMin(Node root) 
  {
    if (root == null) 
    {
      return -1;
    }
    while (root.left != null) 
    {
      root = root.left;
    }
    return root.data;
  }

static int count;
    public static int findLeafNodes(Node root)
    {
        
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            count++;
        }
        findLeafNodes(root.left);
        findLeafNodes(root.right);
        return count;
    }

  public static int Count(Node root) 
  {
    if (root == null) 
    {
      return 0;
    }
    if (root.left == null && root.right == null) 
    {
      return 1;
    }
    int leftCount = Count(root.left);
    int RightCount = Count(root.right);
    return leftCount + RightCount;
  }

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    BST d = new BST();
    boolean f11 = true;
    while (f11) 
    {
      boolean f4 = true;
      while (f4) 
      {
        System.out.println();
        System.out.println(
          "                  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |                * BINARY SEARCH TREE *                 |"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |           Which Data You Want To Store...?            |"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |           Press 1. Integer                            |"
        );
        System.out.println(
          "                 |           Press 2. Character                          |"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |           For Exit ---> Press 3.                      |"
        );
        System.out.println(
          "                 |                                                       |"
        );
        System.out.println(
          "                 |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|"
        );
        System.out.println();
        System.out.println();
        System.out.print("                 Enter Your Choice : ");
        int n = sc.nextInt();
        switch (n) 
        {
          case 1:
            {
              choice = 1;
              max = 0;
              a1 = new Hashtable<>();
              System.out.println();
              System.out.println(
                "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
              );
              System.out.println();
              System.out.print("                 Enter Number Of Elements : ");
              int num = sc.nextInt();

              System.out.println(
                "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
              );
              System.out.println();
              System.out.println(
                "                                 Enter Preorder Traversal               "
              );
              System.out.println();
              for (int i = 1; i <= num; i++) 
              {
                System.out.print("                 Enter Node " + i + " : ");
                int a = sc.nextInt();
                max++;
                d.add(a);
              }
              boolean f1 = true;
              while (f1) 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.println(
                  "                 Do You Want To Do Any Operation...?"
                );
                System.out.println();
                System.out.println("                 Press 1. Yes  ");
                System.out.println("                 Press 2. No   ");
                System.out.println();
                System.out.print("                 Enter Your Choice : ");
                int number = sc.nextInt();
                switch (number) 
                {
                  case 1:
                    {
                      d.operation();
                      f1 = false;
                      break;
                    }
                  case 2:
                    {
                      f1 = false;
                      break;
                    }
                  default:
                    {
                      System.out.println();
                      System.out.println("                 Invalid Choice    ");
                    }
                }
              }
              boolean t = true;
              while (t) 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.println(
                  "                 Do You Want To Do Asks Any Question...?"
                );
                System.out.println();
                System.out.println("                 Press 1. Yes  ");
                System.out.println("                 Press 2. No   ");
                System.out.println();
                System.out.print("                 Enter Your Choice : ");
                int number = sc.nextInt();
                switch (number) 
                {
                  case 1:
                    {
                      d.Question();
                      t = false;
                      break;
                    }
                  case 2:
                    {
                      t = false;
                      break;
                    }
                  default:
                    {
                      System.out.println();
                      System.out.println("                 Invalid Choice    ");
                    }
                }
              }
              d.Traversal();
              boolean flag = false;
              do 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println(
                  "                |                                                         |"
                );
                System.out.println(
                  "                |               * ARRAY REPRESENTATION *                  |"
                );
                System.out.println(
                  "                |                                                         |"
                );
                System.out.println(
                  "                |           From Which Index You Want To Do...?           |"
                );
                System.out.println(
                  "                |                                                         |"
                );
                System.out.println(
                  "                |           Press 1. Index From Zero                      |"
                );
                System.out.println(
                  "                |           Press 2. Index From One                       |"
                );
                System.out.println(
                  "                |                                                         |"
                );
                System.out.println(
                  "                |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|"
                );
                System.out.println();
                System.out.println();
                System.out.print("                Enter Your Choice : ");
                int choice = sc.nextInt();
                switch (choice) 
                {
                  case 1:
                    {
                      System.out.println(
                        "                _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                      );
                      System.out.println();
                      System.out.println(
                        "                BST In Form Of Array Index start From 0 : "
                      );
                      System.out.println();
                      d.storeIntoArrayStartingWithZero(d.root, a1, 0);
                      System.out.print("                ");
                      int count = 0;
                      for (int i = 0;; i++) 
                      {
                        int q = 0;
                        if (a1.containsKey(i)) 
                        {
                          q = a1.remove(i);
                          count++;

                          System.out.print("" + q + " ");
                        } 
                        else 
                        {
                          System.out.print("__ ");
                        }
                        if (count == max) 
                        {
                          flag = false;
                          d.clear();
                          break;
                        }
                      }
                      break;
                    }
                  case 2:
                    {
                      System.out.println(
                        "                _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                      );
                      System.out.println();
                      System.out.println(
                        "                BST In Form Of Array Index start From 1 : "
                      );
                      System.out.println();
                      d.storeIntoArrayStartingWithOne(d.root, a1, 1);
                      System.out.print("                ");
                      int count = 0;
                      for (int i = 0;; i++) 
                      {
                        int q = 0;
                        if (a1.containsKey(i)) 
                        {
                          q = a1.get(i);
                          count++;
                          System.out.print(q + " ");
                        } 
                        else 
                        {
                          System.out.print("__ ");
                        }

                        if (count == max) 
                        {
                          d.clear();
                          break;
                        }
                      }
                      flag = false;
                      break;
                    }
                  default:
                    {
                      System.out.println();
                      System.out.println("Invalid Choice");
                      System.out.println();
                      flag = true;
                    }
                }
              } while (flag);
              System.out.println();
              f4 = false;
              f11 = false;
              break;
            }
          case 2:
            {
              a1 = new Hashtable<>();
              choice = 2;
              max = 0;
              System.out.println();
              System.out.println(
                "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
              );
              System.out.println();
              System.out.print("                 Enter Number Of Elements : ");
              int num = sc.nextInt();
              System.out.println();
              System.out.println(
                "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
              );
              System.out.println();
              System.out.println(
                "                                 Enter Preorder Traversal               "
              );
              System.out.println();
              for (int i = 1; i <= num; i++) 
              {
                System.out.print("                 Enter Node " + i + " : ");
                char a = sc.next().charAt(0);
                int n1 = (char) a - '0';
                max++;
                d.add(n1);
              }
              System.out.println();
              boolean f1 = true;
              while (f1) 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.println(
                  "                 Do You Want To Do Any Operation...?"
                );
                System.out.println();
                System.out.println("                 Press 1. Yes  ");
                System.out.println("                 Press 2. No   ");
                System.out.println();
                System.out.print("                 Enter Your Choice : ");
                int number = sc.nextInt();
                switch (number) 
                {
                  case 1:
                    {
                      d.operation();
                      f1 = false;
                      break;
                    }
                  case 2:
                    {
                      f1 = false;
                      break;
                    }
                  default:
                    {
                      System.out.println();
                      System.out.println("                 Invalid Choice    ");
                    }
                }
              }
              boolean t1 = true;
              while (t1) 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.println(
                  "                 Do You Want To Do Asks Any Question...?"
                );
                System.out.println();
                System.out.println("                 Press 1. Yes  ");
                System.out.println("                 Press 2. No   ");
                System.out.println();
                System.out.print("                 Enter Your Choice : ");
                int number = sc.nextInt();
                switch (number) 
                {
                  case 1:
                    {
                      d.Question();
                      t1 = false;
                      break;
                    }
                  case 2:
                    {
                      t1 = false;
                      break;
                    }
                  default:
                    {
                      System.out.println();
                      System.out.println("                 Invalid Choice    ");
                    }
                }
              }
              d.Traversal();
              boolean flag = false;
              do 
              {
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println(
                  "                |                                                         |"
                );
                System.out.println(
                  "                |               * ARRAY REPRESENTATION *                  |"
                );
                System.out.println(
                  "                |                                                         |"
                );
                System.out.println(
                  "                |           From Which Index You Want To Do...?           |"
                );
                System.out.println(
                  "                |                                                         |"
                );
                System.out.println(
                  "                |           Press 1. Index From Zero                      |"
                );
                System.out.println(
                  "                |           Press 2. Index From One                       |"
                );
                System.out.println(
                  "                |                                                         |"
                );
                System.out.println(
                  "                |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|"
                );
                System.out.println();
                System.out.println();
                System.out.print("                Enter Your Choice : ");
                int choice = sc.nextInt();
                switch (choice) 
                {
                  case 1:
                    {
                      System.out.println(
                        "                _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                      );
                      System.out.println();
                      System.out.println(
                        "                BST In Form Of Array Index start From 0 : "
                      );
                      System.out.println();
                      d.storeIntoArrayStartingWithZero(d.root, a1, 0);
                      System.out.print("                ");
                      int count = 0;
                      for (int i = 0;; i++) 
                      {
                        int q = 0;
                        if (a1.containsKey(i)) 
                        {
                          q = a1.remove(i);
                          count++;
                          System.out.print((char) q + " ");
                        } 
                        else 
                        {
                          System.out.print("__ ");
                        }
                        if (count == max) 
                        {
                          flag = false;
                          d.clear();
                          break;
                        }
                      }
                      break;
                    }
                  case 2:
                    {
                      System.out.println(
                        "                _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                      );
                      System.out.println();
                      System.out.println(
                        "                BST In Form Of Array Index start From 1 : "
                      );
                      System.out.println();
                      d.storeIntoArrayStartingWithOne(d.root, a1, 1);
                      System.out.print("                ");
                      int count = 0;
                      for (int i = 0;; i++) 
                      {
                        int q = 0;
                        if (a1.containsKey(i)) 
                        {
                          q = a1.remove(i);
                          count++;
                          System.out.print((char) q + " ");
                        } 
                        else 
                        {
                          System.out.print("__ ");
                        }
                        if (count == max) 
                        {
                          d.clear();
                          break;
                        }
                      }
                      flag = false;
                      break;
                    }
                  default:
                    {
                      System.out.println();
                      System.out.println("Invalid Choice");
                      System.out.println();
                      flag = true;
                    }
                }
              } while (flag);
              System.out.println();
              f4 = false;
              f11 = false;
              break;
            }
          case 3:
            {
              System.out.println();
              System.out.println(
                "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
              );
              System.out.println();
              System.out.println(
                "                                       PROGRAM END"
              );
              System.out.println(
                "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
              );
              System.out.println();
              System.exit(0);
            }
          default:
            {
              System.out.println();
              System.out.println("                 Invalid choice");
            }
        }

        boolean f8 = true;
        while (f8) 
        {
          System.out.println();
          System.out.println(
            "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
          );
          System.out.println();
          System.out.println(
            "                 Do You Want To Contiune The Program...?"
          );
          System.out.println();
          System.out.println("                 Press 1. Yes  ");
          System.out.println("                 Press 2. No   ");
          System.out.println();
          System.out.print("                 Enter Your Choice : ");
          int number = sc.nextInt();
          switch (number) 
          {
            case 1:
              {
                f11 = true;
                f8 = false;
                break;
              }
            case 2:
              {
                f4 = false;
                System.out.println();
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.out.println(
                  "                                       PROGRAM END"
                );
                System.out.println(
                  "                 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"
                );
                System.out.println();
                System.exit(0);
                break;
              }
            default:
              {
                System.out.println();
                System.out.println("                 Invalid Choice    ");
              }
          }
        }
      }
    }
  }
}
