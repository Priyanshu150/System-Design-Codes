class Movie{
    public String title;
    public int duration;

    public void displayDetials(){
        System.out.println("Title: " + title + ", Duration: " + duration + " mins");
    }
}

public Class Main {
    public static void main(String[] args){
        Movie movie = new Movie();
        movie.displayDetials();
    }
}