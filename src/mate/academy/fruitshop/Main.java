package mate.academy.fruitshop;

public class Main {
    public static void main(String[] args) {
  /*      Storage storage = new Storage();
        // 1. Read the file
        FileService fileService = new FileServiceImpl();
        List<List<String>> lists = fileService.readFile("test.txt");

        // 2. Convert list of String into fruit
        List<FruitDto> dtos = new ArrayList<>();
        FruitMapper fruitMapper = new FruitMapper();
        for (List<String> data : lists) {
            FruitDto fruitDto = fruitMapper.convert(data);
            dtos.add(fruitDto);
        }

        // 3. Based on operation -->
        // do some actions with fruits
        Map<String, FruitOperation> fruitOperationMap = new HashMap<>();
        fruitOperationMap.put("b", new BuyFruitOperation());
        fruitOperationMap.put("s", new SupplyFruitOperation(storage));
        // for each dto
        // for the Fruit object
        // for each item in quantity --> call operation.apply();
        for (FruitDto dto: dtos) {
            Fruit fruit = new Fruit();
            fruit.setName(dto.getName());
            fruit.setExpirationDate(LocalDate.parse(dto.getDate()));
            for (int i = 0; i < dto.getQuantity(); i++) {
                fruitOperationMap.get(dto.getOperation()).apply(fruit);
            }
        }
*/
        // Write data into the file
    }
}
