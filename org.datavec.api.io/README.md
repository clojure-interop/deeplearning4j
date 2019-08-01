# Bindings for org.datavec.api.io

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/org.datavec.api.io "1.0.0"]
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

- class **org.datavec.api.io.BinaryComparable**
- class **org.datavec.api.io.DataInputBuffer**
- class **org.datavec.api.io.DataOutputBuffer**
- interface **org.datavec.api.io.RawComparator**
- interface **org.datavec.api.io.WritableComparable**
- class **org.datavec.api.io.WritableComparator**
- interface **org.datavec.api.io.WritableConverter**
- class **org.datavec.api.io.WritableUtils**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
