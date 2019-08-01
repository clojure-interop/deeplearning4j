# Bindings for org.deeplearning4j.eval

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/org.deeplearning4j.eval "1.0.0"]
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

- class **org.deeplearning4j.eval.BaseEvaluation**
- class **org.deeplearning4j.eval.ConfusionMatrix**
- enum **org.deeplearning4j.eval.Evaluation$Metric**
- class **org.deeplearning4j.eval.Evaluation**
- enum **org.deeplearning4j.eval.EvaluationAveraging**
- class **org.deeplearning4j.eval.EvaluationBinary**
- class **org.deeplearning4j.eval.EvaluationCalibration**
- class **org.deeplearning4j.eval.EvaluationUtils**
- interface **org.deeplearning4j.eval.IEvaluation**
- class **org.deeplearning4j.eval.ROC$CountsForThreshold**
- class **org.deeplearning4j.eval.ROC**
- class **org.deeplearning4j.eval.ROCBinary**
- class **org.deeplearning4j.eval.ROCMultiClass**
- enum **org.deeplearning4j.eval.RegressionEvaluation$Metric**
- class **org.deeplearning4j.eval.RegressionEvaluation**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
