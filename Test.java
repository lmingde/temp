public class Test{
    Map<Long,Person> groupById(List<Person> persons){
        Map<Long,Person> map = persons.stream().collect(Collectors.toMap(e->e.getId(),e->e));
        return map;
    }
}
