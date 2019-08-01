# Bindings for onnx

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/onnx "1.0.0"]
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

- enum **onnx.OnnxMlProto3$AttributeProto$AttributeType**
- class **onnx.OnnxMlProto3$AttributeProto$Builder**
- class **onnx.OnnxMlProto3$AttributeProto**
- interface **onnx.OnnxMlProto3$AttributeProtoOrBuilder**
- class **onnx.OnnxMlProto3$GraphProto$Builder**
- class **onnx.OnnxMlProto3$GraphProto**
- interface **onnx.OnnxMlProto3$GraphProtoOrBuilder**
- class **onnx.OnnxMlProto3$ModelProto$Builder**
- class **onnx.OnnxMlProto3$ModelProto**
- interface **onnx.OnnxMlProto3$ModelProtoOrBuilder**
- class **onnx.OnnxMlProto3$NodeProto$Builder**
- class **onnx.OnnxMlProto3$NodeProto**
- interface **onnx.OnnxMlProto3$NodeProtoOrBuilder**
- class **onnx.OnnxMlProto3$OperatorSetIdProto$Builder**
- class **onnx.OnnxMlProto3$OperatorSetIdProto**
- interface **onnx.OnnxMlProto3$OperatorSetIdProtoOrBuilder**
- class **onnx.OnnxMlProto3$StringStringEntryProto$Builder**
- class **onnx.OnnxMlProto3$StringStringEntryProto**
- interface **onnx.OnnxMlProto3$StringStringEntryProtoOrBuilder**
- class **onnx.OnnxMlProto3$TensorProto$Builder**
- enum **onnx.OnnxMlProto3$TensorProto$DataType**
- class **onnx.OnnxMlProto3$TensorProto$Segment$Builder**
- class **onnx.OnnxMlProto3$TensorProto$Segment**
- interface **onnx.OnnxMlProto3$TensorProto$SegmentOrBuilder**
- class **onnx.OnnxMlProto3$TensorProto**
- interface **onnx.OnnxMlProto3$TensorProtoOrBuilder**
- class **onnx.OnnxMlProto3$TensorShapeProto$Builder**
- class **onnx.OnnxMlProto3$TensorShapeProto$Dimension$Builder**
- enum **onnx.OnnxMlProto3$TensorShapeProto$Dimension$ValueCase**
- class **onnx.OnnxMlProto3$TensorShapeProto$Dimension**
- interface **onnx.OnnxMlProto3$TensorShapeProto$DimensionOrBuilder**
- class **onnx.OnnxMlProto3$TensorShapeProto**
- interface **onnx.OnnxMlProto3$TensorShapeProtoOrBuilder**
- class **onnx.OnnxMlProto3$TypeProto$Builder**
- class **onnx.OnnxMlProto3$TypeProto$Map$Builder**
- class **onnx.OnnxMlProto3$TypeProto$Map**
- interface **onnx.OnnxMlProto3$TypeProto$MapOrBuilder**
- class **onnx.OnnxMlProto3$TypeProto$Sequence$Builder**
- class **onnx.OnnxMlProto3$TypeProto$Sequence**
- interface **onnx.OnnxMlProto3$TypeProto$SequenceOrBuilder**
- class **onnx.OnnxMlProto3$TypeProto$Tensor$Builder**
- class **onnx.OnnxMlProto3$TypeProto$Tensor**
- interface **onnx.OnnxMlProto3$TypeProto$TensorOrBuilder**
- enum **onnx.OnnxMlProto3$TypeProto$ValueCase**
- class **onnx.OnnxMlProto3$TypeProto**
- interface **onnx.OnnxMlProto3$TypeProtoOrBuilder**
- class **onnx.OnnxMlProto3$ValueInfoProto$Builder**
- class **onnx.OnnxMlProto3$ValueInfoProto**
- interface **onnx.OnnxMlProto3$ValueInfoProtoOrBuilder**
- enum **onnx.OnnxMlProto3$Version**
- class **onnx.OnnxMlProto3**
- class **onnx.OnnxOperatorsProto3$OperatorProto$Builder**
- enum **onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus**
- class **onnx.OnnxOperatorsProto3$OperatorProto**
- interface **onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder**
- class **onnx.OnnxOperatorsProto3$OperatorSetProto$Builder**
- class **onnx.OnnxOperatorsProto3$OperatorSetProto**
- interface **onnx.OnnxOperatorsProto3$OperatorSetProtoOrBuilder**
- class **onnx.OnnxOperatorsProto3**
- enum **onnx.OnnxProto3$AttributeProto$AttributeType**
- class **onnx.OnnxProto3$AttributeProto$Builder**
- class **onnx.OnnxProto3$AttributeProto**
- interface **onnx.OnnxProto3$AttributeProtoOrBuilder**
- class **onnx.OnnxProto3$GraphProto$Builder**
- class **onnx.OnnxProto3$GraphProto**
- interface **onnx.OnnxProto3$GraphProtoOrBuilder**
- class **onnx.OnnxProto3$ModelProto$Builder**
- class **onnx.OnnxProto3$ModelProto**
- interface **onnx.OnnxProto3$ModelProtoOrBuilder**
- class **onnx.OnnxProto3$NodeProto$Builder**
- class **onnx.OnnxProto3$NodeProto**
- interface **onnx.OnnxProto3$NodeProtoOrBuilder**
- class **onnx.OnnxProto3$OperatorSetIdProto$Builder**
- class **onnx.OnnxProto3$OperatorSetIdProto**
- interface **onnx.OnnxProto3$OperatorSetIdProtoOrBuilder**
- class **onnx.OnnxProto3$StringStringEntryProto$Builder**
- class **onnx.OnnxProto3$StringStringEntryProto**
- interface **onnx.OnnxProto3$StringStringEntryProtoOrBuilder**
- class **onnx.OnnxProto3$TensorProto$Builder**
- enum **onnx.OnnxProto3$TensorProto$DataType**
- class **onnx.OnnxProto3$TensorProto$Segment$Builder**
- class **onnx.OnnxProto3$TensorProto$Segment**
- interface **onnx.OnnxProto3$TensorProto$SegmentOrBuilder**
- class **onnx.OnnxProto3$TensorProto**
- interface **onnx.OnnxProto3$TensorProtoOrBuilder**
- class **onnx.OnnxProto3$TensorShapeProto$Builder**
- class **onnx.OnnxProto3$TensorShapeProto$Dimension$Builder**
- enum **onnx.OnnxProto3$TensorShapeProto$Dimension$ValueCase**
- class **onnx.OnnxProto3$TensorShapeProto$Dimension**
- interface **onnx.OnnxProto3$TensorShapeProto$DimensionOrBuilder**
- class **onnx.OnnxProto3$TensorShapeProto**
- interface **onnx.OnnxProto3$TensorShapeProtoOrBuilder**
- class **onnx.OnnxProto3$TypeProto$Builder**
- class **onnx.OnnxProto3$TypeProto$Tensor$Builder**
- class **onnx.OnnxProto3$TypeProto$Tensor**
- interface **onnx.OnnxProto3$TypeProto$TensorOrBuilder**
- enum **onnx.OnnxProto3$TypeProto$ValueCase**
- class **onnx.OnnxProto3$TypeProto**
- interface **onnx.OnnxProto3$TypeProtoOrBuilder**
- class **onnx.OnnxProto3$ValueInfoProto$Builder**
- class **onnx.OnnxProto3$ValueInfoProto**
- interface **onnx.OnnxProto3$ValueInfoProtoOrBuilder**
- enum **onnx.OnnxProto3$Version**
- class **onnx.OnnxProto3**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
