package org.example.Lesson14;
//Enum создан для ограничения количества наследников от базового или abstract класса
//От enum нельзя наследовать и он не может быть наследником (кроме Object)
//Но может реализовывать интерфейсы => содержать абстрактные методы
public enum ProcessorType implements Describable {
    BIT_32("bit-32"),
//            {
//        @Override
//        public String getDescription() {
//            return "bit 32 description";
//        }
//    }
    BIT_64("bit-64");
//        {
//        @Override
//        public String getDescription() {
//            return "bit 64 description";
//        }
//    };
// После реализации интерфейса это стало не обязательным, так как мы реализовали сразу же для ProcessorType
    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return name + " description";
    }
}
