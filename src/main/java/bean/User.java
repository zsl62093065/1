package bean;

public class User {
    private String name;
    private int age;

    public User() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     *  equals的重写
      * @param obj
     * @return
     */
    public boolean equals(Object obj){
        if (obj instanceof User){
            return name.equals(((User)obj).name)&&age==(((User)obj).age);
        }else{
           return  false;
        }
    }

    /**
     * 重写hashcode
     * @return
     */
    public int hashcode(){
        return name.hashCode();
    }

}
