public class Average{
    public static void main(String[] args){
        Double num1,num2;
        if(args.length != 2)
        {
            System.out.println("Cannot accept more than two args.");
            System.exit(0);
        }
        else{
            try{
                num1 = Double.parseDouble(args[0]);
                num2 = Double.parseDouble(args[1]);
                Double result  = (num1+num2)/2;
                System.out.println("Average of "+num1+" and " +num2+" is : "+result);
            }
            catch(NumberFormatException e){
                System.err.println("Argument must be numbers.");
                System.exit(1);
            }
        }
    }
}