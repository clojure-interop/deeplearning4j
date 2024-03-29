# Bindings for org.datavec.api.transform

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/org.datavec.api.transform "1.0.0"]
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

- interface **org.datavec.api.transform.ColumnOp**
- enum **org.datavec.api.transform.ColumnType**
- class **org.datavec.api.transform.DataAction**
- enum **org.datavec.api.transform.Distance**
- enum **org.datavec.api.transform.MathFunction**
- enum **org.datavec.api.transform.MathOp**
- enum **org.datavec.api.transform.ReduceOp**
- enum **org.datavec.api.transform.StringReduceOp**
- interface **org.datavec.api.transform.Transform**
- class **org.datavec.api.transform.TransformProcess$Builder**
- class **org.datavec.api.transform.TransformProcess**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
