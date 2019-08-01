# Bindings for org.deeplearning4j.util

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/org.deeplearning4j.util "1.0.0"]
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

- class **org.deeplearning4j.util.Convolution1DUtils**
- class **org.deeplearning4j.util.Convolution3DUtils**
- class **org.deeplearning4j.util.ConvolutionUtils**
- class **org.deeplearning4j.util.CrashReportingUtil**
- class **org.deeplearning4j.util.DiskBasedQueue**
- class **org.deeplearning4j.util.Dl4jReflection**
- class **org.deeplearning4j.util.MaskedReductionUtil**
- class **org.deeplearning4j.util.ModelGuesser**
- class **org.deeplearning4j.util.ModelGuesserException**
- class **org.deeplearning4j.util.ModelSerializer**
- class **org.deeplearning4j.util.MovingWindowMatrix**
- class **org.deeplearning4j.util.NetworkUtils**
- class **org.deeplearning4j.util.ThreadUtils$UncheckedInterruptedException**
- class **org.deeplearning4j.util.ThreadUtils**
- class **org.deeplearning4j.util.TimeSeriesUtils**
- class **org.deeplearning4j.util.UIDProvider**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
