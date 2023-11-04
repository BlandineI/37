class SimpleInterest {

    float principal;
    float rate;
    float time;

    public SimpleInterest(float principal, float rate, float time){
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public float calculate(){
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args){
        // Create a SimpleInterest object
        SimpleInterest simpleInterest = new SimpleInterest(100000, 5, 5);

        // Compute the simple interest
float Interest = simpleInterest.calculate();
// Print the simple interest amount
        System.out.println("The simple interest amount of Mr. Rob is " + Interest);;

}
}