class ex241b

{
    public static void main(String args[])
    {
        String proposedBagSizeString = new String ("11.8"); //Try using 11 and it will convert it into double and int both. Whereas 11.8 can only be converted to double.
        double proposedBagSize= Double.parseDouble(proposedBagSizeString);
        int proposedBagSizeWhole= Integer.parseInt(proposedBagSizeString);

    System.out.println(proposedBagSize);
    System.out.println(proposedBagSizeWhole);
    }
}
