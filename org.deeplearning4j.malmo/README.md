# Bindings for org.deeplearning4j.malmo

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/org.deeplearning4j.malmo "1.0.0"]
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

- class **org.deeplearning4j.malmo.MalmoActionSpace**
- class **org.deeplearning4j.malmo.MalmoActionSpaceDiscrete**
- class **org.deeplearning4j.malmo.MalmoBox**
- class **org.deeplearning4j.malmo.MalmoConnectionError**
- class **org.deeplearning4j.malmo.MalmoDescretePositionPolicy**
- class **org.deeplearning4j.malmo.MalmoEnv**
- class **org.deeplearning4j.malmo.MalmoObservationSpace**
- class **org.deeplearning4j.malmo.MalmoObservationSpaceGrid**
- class **org.deeplearning4j.malmo.MalmoObservationSpacePixels**
- class **org.deeplearning4j.malmo.MalmoObservationSpacePosition**
- interface **org.deeplearning4j.malmo.MalmoResetHandler**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
