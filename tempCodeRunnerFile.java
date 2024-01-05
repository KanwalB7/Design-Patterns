Implementor implementorA = new ConcreteImplementorA();
            Abstraction abstractionA = new RefinedAbstraction(implementorA);
            abstractionA.operation();
            Implementor implementorB = new ConcreteImplementorB();
            Abstraction abstractionB = new RefinedAbstraction(implementorB);
            abstractionB.operation();