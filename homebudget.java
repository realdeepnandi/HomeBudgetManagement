import java.util.Scanner;
import java.util.InputMismatchException;
abstract class household{
    public abstract void Items();
    public abstract void Furniture();
    public abstract void Groceries();
    public abstract void Bathroom();
    public abstract void Bill();
    static int budget=50000;
    static int chair,dining_table,study_table,chairp,dining_tablep,study_tablep;
    static int bathtub,shampoo,shower,bathtubp,shampoop,showerp;
    static int rice,sugar,wheat,ricep,sugarp,wheatp;
}

class household_extended extends household{
    public void Items(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose what you want to buy\n");
        System.out.println("1. Furniture \n2. Groceries\n3. Bathroom\n4. Bill \n0. Exit");
        try {
        n = sc.nextInt();
        
        switch(n){
            
            case 1: try {Furniture();} catch (InputMismatchException e){System.out.println("\n\nInput number only");
            Furniture();}
            break;
            case 2: try {Groceries();} catch (InputMismatchException e){System.out.println("\n\nInput number only");
            Groceries();}
            break;
            case 3: try {Bathroom();} catch (InputMismatchException e){System.out.println("\n\nInput number only");
            Bathroom();}
            break;
            case 4: try {Bill();} catch (InputMismatchException e){System.out.println("\n\nInput number only");
            Bill();}
            break;
            case 0: System.out.println("Program will terminate...");
                    System.exit(0);
            break;
            default: System.out.println("\n\nChoose a valid option");
            Items();
            break;
        } 
        } catch (InputMismatchException e){
            System.out.println("\n\nInput number only");
            Items();
        } 
    }

    public void Furniture(){
        if(budget!=0){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoose what you want to buy\n");
        System.out.println("1. Chair - $40 \n2. Dining Table - $100\n3. Study Table - $80\n0. Back");
        try{
        n = sc.nextInt();
        if(n==1){
            
                System.out.println("\nEnter Quantity\n");
                int x = sc.nextInt();
                if(x<0){
                    System.out.println("Quantity can't be negative\n\n");
                    Furniture();
                } else {
                    chair +=x;
                    chairp = x*40;
                    budget = budget - chairp;
                    if(budget<0){
                        budget = budget + chairp;
                        chairp = x/40;
                        chair -= x;
                        System.out.println("Remaining Budget = "+budget);
                        System.out.println("Sorry price is going out of range. Try reducing the quantity\n\n");
                        Furniture();
                    }else {
                        System.out.println("Remaining Budget = "+budget);
                    }
                    Furniture();
                }
            
        } else if(n==2){
                System.out.println("\nEnter Quantity\n");
                int x = sc.nextInt();
                if(x<0){
                    System.out.println("Quantity can't be negative\n\n");
                    Furniture();
                } else {
                    dining_table +=x;
                    dining_tablep = x*100;
                    budget = budget - dining_tablep;
                    if(budget<0){
                        budget = budget + dining_tablep;
                        dining_tablep = x/100;
                        dining_table -= x;
                        System.out.println("Remaining Budget = "+budget);
                        System.out.println("Sorry price is going out of range. Try reducing the quantity\n\n");
                        Furniture();
                    }else {
                        System.out.println("Remaining Budget = "+budget);
                    }
                    Furniture();
                }
        } else if(n==3){
                System.out.println("\nEnter Quantity\n");
                int x = sc.nextInt();
                if(x<0){
                    System.out.println("Quantity can't be negative\n\n");
                    Furniture();
                } else {
                    study_table +=x;
                    study_tablep = x*80;
                    budget = budget - study_tablep;
                    if(budget<0){
                        budget = budget + study_tablep;
                        study_tablep = x/80;
                        study_table -= x;
                        System.out.println("Remaining Budget = "+budget);
                        System.out.println("Sorry price is going out of range. Try reducing the quantity\n\n");
                        Furniture();
                    }else {
                        System.out.println("Remaining Budget = "+budget);
                    }
                    Furniture();
                }
            
        } else if(n==0){
            System.out.println("\n\n");
            Items();
        }else{
            System.out.println("\n\nWrong Input\n");
            Furniture();
        }
        } catch (InputMismatchException e){
            System.out.println("\n\nInput number only");
            Furniture();
        }
    } else {
        System.out.println("\n\n Remaining money is zero going to cart\n");
        Bill();
    }
    }
    public void Bathroom(){
        if(budget!=0){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoose what you want to buy\n");
        System.out.println("1. Bathtub - $500 \n2. Shampoo - $50\n3. Shower - $200\n0. Back");
        try {
        n = sc.nextInt();
        if(n==1){
                System.out.println("\nEnter Quantity\n");
                int x = sc.nextInt();
                if(x<0){
                    System.out.println("Quantity can't be negative\n\n");
                    Bathroom();
                } else {
                    bathtub +=x;
                    bathtubp = x*500;
                    budget = budget - bathtubp;
                    if(budget<0){
                        budget = budget + bathtubp;
                        bathtubp = x/500;
                        bathtub -= x;
                        System.out.println("Remaining Budget = "+budget);
                        System.out.println("Sorry price is going out of range. Try reducing the quantity\n\n");
                        Bathroom();
                    }else {
                        System.out.println("Remaining Budget = "+budget);
                    }
                    Bathroom();
                }
            
        } else if(n==2){
                System.out.println("\nEnter Quantity\n");
                int x = sc.nextInt();
                if(x<0){
                    System.out.println("Quantity can't be negative\n\n");
                    Bathroom();
                } else {
                    shampoo +=x;
                    shampoop = x*50;
                    budget = budget - shampoop;
                    if(budget<0){
                        budget = budget + shampoop;
                        shampoop = x/50;
                        shampoo -= x;
                        System.out.println("Remaining Budget = "+budget);
                        System.out.println("Sorry price is going out of range. Try reducing the quantity\n\n");
                        Bathroom();
                    }else {
                        System.out.println("Remaining Budget = "+budget);
                    }
                    Bathroom();
                }
        } else if(n==3){
                System.out.println("\nEnter Quantity\n");
                int x = sc.nextInt();
                if(x<0){
                    System.out.println("Quantity can't be negative\n\n");
                    Bathroom();
                } else {
                    shower +=x;
                    showerp = x*200;
                    budget = budget - showerp;
                    if(budget<0){
                        budget = budget + showerp;
                        showerp = x/200;
                        shower -= x;
                        System.out.println("Remaining Budget = "+budget);
                        System.out.println("Sorry price is going out of range. Try reducing the quantity\n\n");
                        Bathroom();
                    }else {
                        System.out.println("Remaining Budget = "+budget);
                    }
                    Bathroom();
                }
            
        } else if(n==0){
            System.out.println("\n\n");
            Items();
        }else{
            System.out.println("\n\nWrong Input\n");
            Bathroom();
        }
        } catch (InputMismatchException e){
            System.out.println("\n\nInput number only");
            Bathroom();
        }
    } else {
        System.out.println("\n\nRemaining money is zero going to cart\n");
        Bill();
    }
    }
    public void Groceries(){
        if(budget!=0){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoose what you want to buy\n");
        System.out.println("1. Rice - $5/kg \n2. Sugar - $8/kg\n3. Wheat - $5/kg\n0. Back");
        n = sc.nextInt();
        if(n==1){
                System.out.println("\nEnter Quantity in kg(s)\n");
                int x = sc.nextInt();
                if(x<0){
                    System.out.println("Quantity can't be negative\n\n");
                    Groceries();
                } else {
                    rice +=x;
                    ricep = x*5;
                    budget = budget - ricep;
                    if(budget<0){
                        budget = budget + ricep;
                        ricep = x/5;
                        rice -= x;
                        System.out.println("Remaining Budget = "+budget);
                        System.out.println("Sorry price is going out of range. Try reducing the quantity\n\n");
                        Groceries();
                    }else {
                        System.out.println("Remaining Budget = "+budget);
                    }
                    Groceries();
                }
            
        } else if(n==2){
                System.out.println("\nEnter Quantity\n");
                int x = sc.nextInt();
                if(x<0){
                    System.out.println("Quantity can't be negative\n\n");
                    Groceries();
                } else {
                    sugar +=x;
                    sugarp = x*8;
                    budget = budget - sugarp;
                    if(budget<0){
                        budget = budget + sugarp;
                        sugarp = x/8;
                        sugar -= x;
                        System.out.println("Remaining Budget = "+budget);
                        System.out.println("Sorry price is going out of range. Try reducing the quantity\n\n");
                        Groceries();
                    }else {
                        System.out.println("Remaining Budget = "+budget);
                    }
                    Groceries();
                }
        } else if(n==3){
                System.out.println("\nEnter Quantity\n");
                int x = sc.nextInt();
                if(x<0){
                    System.out.println("Quantity can't be negative\n\n");
                    Groceries();
                } else {
                    wheat +=x;
                    wheatp = x*5;
                    budget = budget - wheatp;
                    if(budget<0){
                        budget = budget + wheatp;
                        wheatp = x/5;
                        wheat -= x;
                        System.out.println("Remaining Budget = "+budget);
                        System.out.println("Sorry price is going out of range. Try reducing the quantity\n\n");
                        Groceries();
                    }else {
                        System.out.println("Remaining Budget = "+budget);
                    }
                    Groceries();
                }
            
        } else if(n==0){
            System.out.println("\n\n");
            Items();
        }else{
            System.out.println("\n\nWrong Input\n");
            Groceries();
        }
    } else {
        System.out.println("\n\nBudget is zero going to cart\n");
        Bill();
    }
    }
    public void Bill(){
        Scanner sc = new Scanner(System.in);
        int a;
        if(chair!=0){
            chairp = chair*40;
            System.out.println("\n1. Money spent on Chair(s) : "+chair+"x"+"40 = "+chairp);
        }
        if(dining_table!=0){
            dining_tablep = dining_table*100;
            System.out.println("\n2. Money spent on Dining Table(s) : "+dining_table+"x"+"100 = "+dining_tablep);
        }
        if(study_table!=0){
            study_tablep = study_table*80;
            System.out.println("\n3. Money spent on Study Table(s) : "+study_table+"x"+"80 = "+study_tablep);
        }
        if(bathtub!=0){
            bathtubp = bathtub*500;
            System.out.println("\n4. Money spent on Bathtub(s) : "+bathtub+"x"+"500 = "+bathtubp);
        }
        if(shampoo!=0){
            shampoop = shampoo*50;
            System.out.println("\n5. Money spent on Shampoo(s) : "+shampoo+"x"+"50 = "+shampoop);
        }
        if(shower!=0){
            showerp = shower*200;
            System.out.println("\n6. Money spent on Shower(s) : "+shower+"x"+"200 = "+showerp);
        }
        if(rice!=0){
            ricep = rice*5;
            System.out.println("\n7. Money spent on Rice(s) : "+rice+"x"+"5 = "+ricep);
        }
        if(sugar!=0){
            sugarp = sugar*8;
            System.out.println("\n8. Money spent on Sugar(s) : "+sugar+"x"+"8 = "+sugarp);
        }
        if(wheat!=0){
            wheatp = wheat*5;
            System.out.println("\n9. Money spent on Wheat(s) : "+wheat+"x"+"5 = "+wheatp);
        }
        int total = chairp+dining_tablep+study_tablep+bathtubp+shampoop+showerp+ricep+sugarp+wheatp;
        if(total==0){
            System.out.println("Your cart is empty. Press 0 and go back to buy something.");
            int b = sc.nextInt();
            if(b==0){
                Items();
            } else {
                System.out.println("\n\nWrong Option Selected. Try again");
                Bill();
            }
        
        }else{
        System.out.println("\n\n-----------Total : "+total+"-----------");
        System.out.println("Choose from (1-9) option to empty corresponding item\nChoose 10 for going back or choose 0 for bill confirmation");
        a = sc.nextInt();
        if(a==1){
            budget = budget + chairp;
            chairp = 0;
            chair = 0;
            System.out.println("\n\nChair(s) Removed\n");
            Bill();
        } else if(a==2){
            budget = budget + dining_tablep;
            dining_tablep = 0;
            dining_table = 0;
            System.out.println("\n\nDining Table(s) Removed\n");
            Bill();
        } else if(a==3){
            budget = budget + study_tablep;
            study_tablep = 0;
            study_table = 0;
            System.out.println("\n\nStudy Table(s) Removed\n");
            Bill();
        } else if(a==4){
            budget = budget + bathtubp;
            bathtubp = 0;
            bathtub = 0;
            System.out.println("\n\nBathtub(s) Removed\n");
            Bill();
        } else if(a==5){
            budget = budget + shampoop;
            shampoop = 0;
            shampoo = 0;
            System.out.println("\n\nShampoo(s) Removed\n");
            Bill();
        } else if(a==6){
            budget = budget + showerp;
            showerp = 0;
            shower = 0;
            System.out.println("\n\nShower(s) Removed\n");
            Bill();
        }
        else if(a==7){
            budget = budget + ricep;
            ricep = 0;
            rice = 0;
            System.out.println("\n\nRice Removed\n");
            Bill();
        }
        else if(a==8){
            budget = budget + sugarp;
            sugarp = 0;
            sugar = 0;
            System.out.println("\n\nSugar Removed\n");
            Bill();
        }
        else if(a==9){
            budget = budget + wheatp;
            wheatp = 0;
            wheat = 0;
            System.out.println("\n\nWheat Removed\n");
            Bill();
        } else if(a==10){
            Items();
        } else if(a==0){
            System.out.println("---------------------------------------------------------------");
            if(chair!=0){
            System.out.println("\nMoney spent on Chair(s) : "+chair+"x"+"40 = "+chairp);
        }
        if(dining_table!=0){
            System.out.println("\nMoney spent on Dining Table(s) : "+dining_table+"x"+"100 = "+dining_tablep);
        }
        if(study_table!=0){
            System.out.println("\nMoney spent on Study Table(s) : "+study_table+"x"+"80 = "+study_tablep);
        }
        if(bathtub!=0){
            System.out.println("\nMoney spent on Bathtub(s) : "+bathtub+"x"+"500 = "+bathtubp);
        }
        if(shampoo!=0){
            System.out.println("\nMoney spent on Shampoo(s) : "+shampoo+"x"+"50 = "+shampoop);
        }
        if(shower!=0){
            System.out.println("\nMoney spent on Shower(s) : "+shower+"x"+"200 = "+showerp);
        }
        if(rice!=0){
            System.out.println("\nMoney spent on Rice(s) : "+rice+"x"+"5 = "+ricep);
        }
        if(sugar!=0){
            System.out.println("\nMoney spent on Sugar(s) : "+sugar+"x"+"8 = "+sugarp);
        }
        if(wheat!=0){
            System.out.println("\nMoney spent on Wheat(s) : "+wheat+"x"+"5 = "+wheatp);
        }
        int total2 = chairp+dining_tablep+study_tablep+bathtubp+shampoop+showerp+ricep+sugarp+wheatp;
        System.out.println("\n\nTotal : "+total2+"\n ");
        System.out.println("---------------------------------------------------------------");

        }
    }
    }
}



class homebudget{
    public static void main(String ars[]){
        System.out.println("Welcome to Home Budget Management");
        System.out.println("You have $50,000 for your home budget");
        System.out.println("You need to spend it on buying your different household items\nand make sure that you spend it in an efficient way.");
        household_extended obj = new household_extended();
        obj.Items();
    }
}