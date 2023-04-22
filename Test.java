public class Test{
    Map<Long,Person> groupById(List<Person> persons){
        Map<Long,Person> map = new HashMap<>();
        for(Person p:persons){
            map.put(p.getId(),p);
        }
        return map;
    }
}
