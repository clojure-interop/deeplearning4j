# Bindings for org.nd4j.graph

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/org.nd4j.graph "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **org.nd4j.graph.ByteOrder**
- class **org.nd4j.graph.DataType**
- class **org.nd4j.graph.Direction**
- class **org.nd4j.graph.ExecutionMode**
- class **org.nd4j.graph.FlatArray**
- class **org.nd4j.graph.FlatConfiguration**
- class **org.nd4j.graph.FlatGraph**
- class **org.nd4j.graph.FlatNode**
- class **org.nd4j.graph.FlatProperties**
- class **org.nd4j.graph.FlatResult**
- class **org.nd4j.graph.FlatTiming**
- class **org.nd4j.graph.FlatVariable**
- class **org.nd4j.graph.InputType**
- class **org.nd4j.graph.IntPair**
- class **org.nd4j.graph.IntTriple**
- class **org.nd4j.graph.LongPair**
- class **org.nd4j.graph.LongTriple**
- class **org.nd4j.graph.OpClass**
- class **org.nd4j.graph.OpType**
- class **org.nd4j.graph.OutputMode**
- class **org.nd4j.graph.ProfilingMode**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
