# Bindings for org.datavec.api.split

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/org.datavec.api.split "1.0.0"]
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

- class **org.datavec.api.split.BaseInputSplit**
- class **org.datavec.api.split.CollectionInputSplit**
- class **org.datavec.api.split.FileSplit**
- interface **org.datavec.api.split.InputSplit**
- class **org.datavec.api.split.InputStreamInputSplit**
- class **org.datavec.api.split.ListStringSplit**
- class **org.datavec.api.split.NumberedFileInputSplit**
- class **org.datavec.api.split.OutputStreamInputSplit**
- class **org.datavec.api.split.StringSplit**
- interface **org.datavec.api.split.TransformSplit$URITransform**
- class **org.datavec.api.split.TransformSplit**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
