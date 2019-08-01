# Bindings for org.datavec.api.writable

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/org.datavec.api.writable "1.0.0"]
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

- class **org.datavec.api.writable.ArrayWritable**
- class **org.datavec.api.writable.BooleanWritable$Comparator**
- class **org.datavec.api.writable.BooleanWritable**
- class **org.datavec.api.writable.ByteWritable$Comparator**
- class **org.datavec.api.writable.ByteWritable**
- class **org.datavec.api.writable.BytesWritable**
- class **org.datavec.api.writable.DoubleWritable$Comparator**
- class **org.datavec.api.writable.DoubleWritable**
- class **org.datavec.api.writable.FloatWritable$Comparator**
- class **org.datavec.api.writable.FloatWritable**
- class **org.datavec.api.writable.IntWritable$Comparator**
- class **org.datavec.api.writable.IntWritable**
- class **org.datavec.api.writable.LongWritable$Comparator**
- class **org.datavec.api.writable.LongWritable$DecreasingComparator**
- class **org.datavec.api.writable.LongWritable**
- class **org.datavec.api.writable.NDArrayWritable**
- class **org.datavec.api.writable.NullWritable**
- class **org.datavec.api.writable.Text$Comparator**
- class **org.datavec.api.writable.Text**
- class **org.datavec.api.writable.UnsafeWritableInjector**
- interface **org.datavec.api.writable.Writable**
- class **org.datavec.api.writable.WritableFactory**
- enum **org.datavec.api.writable.WritableType**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
