# Bindings for tensorflow

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/tensorflow "1.0.0"]
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

- class **tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder**
- class **tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault**
- interface **tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder**
- class **tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder**
- class **tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder**
- class **tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename**
- interface **tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder**
- class **tensorflow.OpGenOverridesOuterClass$OpGenOverride**
- interface **tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder**
- class **tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder**
- class **tensorflow.OpGenOverridesOuterClass$OpGenOverrides**
- interface **tensorflow.OpGenOverridesOuterClass$OpGenOverridesOrBuilder**
- class **tensorflow.OpGenOverridesOuterClass**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
