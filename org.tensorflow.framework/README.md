# Bindings for org.tensorflow.framework

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/org.tensorflow.framework "1.0.0"]
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

- class **org.tensorflow.framework.AllocationDescription$Builder**
- class **org.tensorflow.framework.AllocationDescription**
- interface **org.tensorflow.framework.AllocationDescriptionOrBuilder**
- class **org.tensorflow.framework.AllocationDescriptionProtos**
- class **org.tensorflow.framework.AllocationRecord$Builder**
- class **org.tensorflow.framework.AllocationRecord**
- interface **org.tensorflow.framework.AllocationRecordOrBuilder**
- class **org.tensorflow.framework.AllocatorMemoryUsed$Builder**
- class **org.tensorflow.framework.AllocatorMemoryUsed**
- interface **org.tensorflow.framework.AllocatorMemoryUsedOrBuilder**
- class **org.tensorflow.framework.ApiDef$Arg$Builder**
- class **org.tensorflow.framework.ApiDef$Arg**
- interface **org.tensorflow.framework.ApiDef$ArgOrBuilder**
- class **org.tensorflow.framework.ApiDef$Attr$Builder**
- class **org.tensorflow.framework.ApiDef$Attr**
- interface **org.tensorflow.framework.ApiDef$AttrOrBuilder**
- class **org.tensorflow.framework.ApiDef$Builder**
- class **org.tensorflow.framework.ApiDef$Endpoint$Builder**
- class **org.tensorflow.framework.ApiDef$Endpoint**
- interface **org.tensorflow.framework.ApiDef$EndpointOrBuilder**
- enum **org.tensorflow.framework.ApiDef$Visibility**
- class **org.tensorflow.framework.ApiDef**
- interface **org.tensorflow.framework.ApiDefOrBuilder**
- class **org.tensorflow.framework.ApiDefProtos**
- class **org.tensorflow.framework.ApiDefs$Builder**
- class **org.tensorflow.framework.ApiDefs**
- interface **org.tensorflow.framework.ApiDefsOrBuilder**
- class **org.tensorflow.framework.AttrValue$Builder**
- class **org.tensorflow.framework.AttrValue$ListValue$Builder**
- class **org.tensorflow.framework.AttrValue$ListValue**
- interface **org.tensorflow.framework.AttrValue$ListValueOrBuilder**
- enum **org.tensorflow.framework.AttrValue$ValueCase**
- class **org.tensorflow.framework.AttrValue**
- interface **org.tensorflow.framework.AttrValueOrBuilder**
- class **org.tensorflow.framework.AttrValueProtos**
- class **org.tensorflow.framework.CostGraphDef$Builder**
- class **org.tensorflow.framework.CostGraphDef$Node$Builder**
- class **org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder**
- class **org.tensorflow.framework.CostGraphDef$Node$InputInfo**
- interface **org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder**
- class **org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder**
- class **org.tensorflow.framework.CostGraphDef$Node$OutputInfo**
- interface **org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder**
- class **org.tensorflow.framework.CostGraphDef$Node**
- interface **org.tensorflow.framework.CostGraphDef$NodeOrBuilder**
- class **org.tensorflow.framework.CostGraphDef**
- interface **org.tensorflow.framework.CostGraphDefOrBuilder**
- class **org.tensorflow.framework.CostGraphProtos**
- enum **org.tensorflow.framework.DataType**
- class **org.tensorflow.framework.DeviceAttributes$Builder**
- class **org.tensorflow.framework.DeviceAttributes**
- interface **org.tensorflow.framework.DeviceAttributesOrBuilder**
- class **org.tensorflow.framework.DeviceAttributesProtos**
- class **org.tensorflow.framework.DeviceLocality$Builder**
- class **org.tensorflow.framework.DeviceLocality**
- interface **org.tensorflow.framework.DeviceLocalityOrBuilder**
- class **org.tensorflow.framework.DeviceStepStats$Builder**
- class **org.tensorflow.framework.DeviceStepStats**
- interface **org.tensorflow.framework.DeviceStepStatsOrBuilder**
- class **org.tensorflow.framework.FunctionDef$Builder**
- class **org.tensorflow.framework.FunctionDef**
- class **org.tensorflow.framework.FunctionDefLibrary$Builder**
- class **org.tensorflow.framework.FunctionDefLibrary**
- interface **org.tensorflow.framework.FunctionDefLibraryOrBuilder**
- interface **org.tensorflow.framework.FunctionDefOrBuilder**
- class **org.tensorflow.framework.FunctionProtos**
- class **org.tensorflow.framework.GradientDef$Builder**
- class **org.tensorflow.framework.GradientDef**
- interface **org.tensorflow.framework.GradientDefOrBuilder**
- class **org.tensorflow.framework.GraphDef$Builder**
- class **org.tensorflow.framework.GraphDef**
- interface **org.tensorflow.framework.GraphDefOrBuilder**
- class **org.tensorflow.framework.GraphProtos**
- class **org.tensorflow.framework.GraphTransferInfo$Builder**
- class **org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder**
- class **org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo**
- interface **org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder**
- enum **org.tensorflow.framework.GraphTransferInfo$Destination**
- class **org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder**
- class **org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo**
- interface **org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder**
- class **org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder**
- class **org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo**
- interface **org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder**
- class **org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder**
- class **org.tensorflow.framework.GraphTransferInfo$NodeInfo**
- interface **org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder**
- class **org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder**
- class **org.tensorflow.framework.GraphTransferInfo$NodeInput**
- class **org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder**
- class **org.tensorflow.framework.GraphTransferInfo$NodeInputInfo**
- interface **org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder**
- interface **org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder**
- class **org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder**
- class **org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo**
- interface **org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder**
- class **org.tensorflow.framework.GraphTransferInfo**
- interface **org.tensorflow.framework.GraphTransferInfoOrBuilder**
- class **org.tensorflow.framework.GraphTransferInfoProto**
- class **org.tensorflow.framework.HistogramProto$Builder**
- class **org.tensorflow.framework.HistogramProto**
- interface **org.tensorflow.framework.HistogramProtoOrBuilder**
- class **org.tensorflow.framework.KernelDef$AttrConstraint$Builder**
- class **org.tensorflow.framework.KernelDef$AttrConstraint**
- interface **org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder**
- class **org.tensorflow.framework.KernelDef$Builder**
- class **org.tensorflow.framework.KernelDef**
- interface **org.tensorflow.framework.KernelDefOrBuilder**
- class **org.tensorflow.framework.KernelDefProtos**
- class **org.tensorflow.framework.LogMemoryProtos**
- class **org.tensorflow.framework.MemoryLogRawAllocation$Builder**
- class **org.tensorflow.framework.MemoryLogRawAllocation**
- interface **org.tensorflow.framework.MemoryLogRawAllocationOrBuilder**
- class **org.tensorflow.framework.MemoryLogRawDeallocation$Builder**
- class **org.tensorflow.framework.MemoryLogRawDeallocation**
- interface **org.tensorflow.framework.MemoryLogRawDeallocationOrBuilder**
- class **org.tensorflow.framework.MemoryLogStep$Builder**
- class **org.tensorflow.framework.MemoryLogStep**
- interface **org.tensorflow.framework.MemoryLogStepOrBuilder**
- class **org.tensorflow.framework.MemoryLogTensorAllocation$Builder**
- class **org.tensorflow.framework.MemoryLogTensorAllocation**
- interface **org.tensorflow.framework.MemoryLogTensorAllocationOrBuilder**
- class **org.tensorflow.framework.MemoryLogTensorDeallocation$Builder**
- class **org.tensorflow.framework.MemoryLogTensorDeallocation**
- interface **org.tensorflow.framework.MemoryLogTensorDeallocationOrBuilder**
- class **org.tensorflow.framework.MemoryLogTensorOutput$Builder**
- class **org.tensorflow.framework.MemoryLogTensorOutput**
- interface **org.tensorflow.framework.MemoryLogTensorOutputOrBuilder**
- class **org.tensorflow.framework.MemoryStats$Builder**
- class **org.tensorflow.framework.MemoryStats**
- interface **org.tensorflow.framework.MemoryStatsOrBuilder**
- class **org.tensorflow.framework.NameAttrList$Builder**
- class **org.tensorflow.framework.NameAttrList**
- interface **org.tensorflow.framework.NameAttrListOrBuilder**
- class **org.tensorflow.framework.NodeDef$Builder**
- class **org.tensorflow.framework.NodeDef**
- interface **org.tensorflow.framework.NodeDefOrBuilder**
- class **org.tensorflow.framework.NodeExecStats$Builder**
- class **org.tensorflow.framework.NodeExecStats**
- interface **org.tensorflow.framework.NodeExecStatsOrBuilder**
- class **org.tensorflow.framework.NodeOutput$Builder**
- class **org.tensorflow.framework.NodeOutput**
- interface **org.tensorflow.framework.NodeOutputOrBuilder**
- class **org.tensorflow.framework.NodeProto**
- class **org.tensorflow.framework.OpDef$ArgDef$Builder**
- class **org.tensorflow.framework.OpDef$ArgDef**
- interface **org.tensorflow.framework.OpDef$ArgDefOrBuilder**
- class **org.tensorflow.framework.OpDef$AttrDef$Builder**
- class **org.tensorflow.framework.OpDef$AttrDef**
- interface **org.tensorflow.framework.OpDef$AttrDefOrBuilder**
- class **org.tensorflow.framework.OpDef$Builder**
- class **org.tensorflow.framework.OpDef**
- interface **org.tensorflow.framework.OpDefOrBuilder**
- class **org.tensorflow.framework.OpDefProtos**
- class **org.tensorflow.framework.OpDeprecation$Builder**
- class **org.tensorflow.framework.OpDeprecation**
- interface **org.tensorflow.framework.OpDeprecationOrBuilder**
- class **org.tensorflow.framework.OpList$Builder**
- class **org.tensorflow.framework.OpList**
- interface **org.tensorflow.framework.OpListOrBuilder**
- class **org.tensorflow.framework.ReaderBaseProtos**
- class **org.tensorflow.framework.ReaderBaseState$Builder**
- class **org.tensorflow.framework.ReaderBaseState**
- interface **org.tensorflow.framework.ReaderBaseStateOrBuilder**
- class **org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder**
- enum **org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType**
- class **org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder**
- class **org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto**
- interface **org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder**
- class **org.tensorflow.framework.RemoteFusedGraphExecuteInfo**
- interface **org.tensorflow.framework.RemoteFusedGraphExecuteInfoOrBuilder**
- class **org.tensorflow.framework.RemoteFusedGraphExecuteInfoProto**
- class **org.tensorflow.framework.ResourceHandle**
- class **org.tensorflow.framework.ResourceHandleProto$Builder**
- class **org.tensorflow.framework.ResourceHandleProto**
- interface **org.tensorflow.framework.ResourceHandleProtoOrBuilder**
- class **org.tensorflow.framework.SaveSliceInfoDef$Builder**
- class **org.tensorflow.framework.SaveSliceInfoDef**
- interface **org.tensorflow.framework.SaveSliceInfoDefOrBuilder**
- class **org.tensorflow.framework.StepStats$Builder**
- class **org.tensorflow.framework.StepStats**
- interface **org.tensorflow.framework.StepStatsOrBuilder**
- class **org.tensorflow.framework.StepStatsProtos**
- class **org.tensorflow.framework.Summary$Audio$Builder**
- class **org.tensorflow.framework.Summary$Audio**
- interface **org.tensorflow.framework.Summary$AudioOrBuilder**
- class **org.tensorflow.framework.Summary$Builder**
- class **org.tensorflow.framework.Summary$Image$Builder**
- class **org.tensorflow.framework.Summary$Image**
- interface **org.tensorflow.framework.Summary$ImageOrBuilder**
- class **org.tensorflow.framework.Summary$Value$Builder**
- enum **org.tensorflow.framework.Summary$Value$ValueCase**
- class **org.tensorflow.framework.Summary$Value**
- interface **org.tensorflow.framework.Summary$ValueOrBuilder**
- class **org.tensorflow.framework.Summary**
- class **org.tensorflow.framework.SummaryDescription$Builder**
- class **org.tensorflow.framework.SummaryDescription**
- interface **org.tensorflow.framework.SummaryDescriptionOrBuilder**
- class **org.tensorflow.framework.SummaryMetadata$Builder**
- class **org.tensorflow.framework.SummaryMetadata$PluginData$Builder**
- class **org.tensorflow.framework.SummaryMetadata$PluginData**
- interface **org.tensorflow.framework.SummaryMetadata$PluginDataOrBuilder**
- class **org.tensorflow.framework.SummaryMetadata**
- interface **org.tensorflow.framework.SummaryMetadataOrBuilder**
- interface **org.tensorflow.framework.SummaryOrBuilder**
- class **org.tensorflow.framework.SummaryProtos**
- class **org.tensorflow.framework.TensorDescription$Builder**
- class **org.tensorflow.framework.TensorDescription**
- interface **org.tensorflow.framework.TensorDescriptionOrBuilder**
- class **org.tensorflow.framework.TensorDescriptionProtos**
- class **org.tensorflow.framework.TensorProto$Builder**
- class **org.tensorflow.framework.TensorProto**
- interface **org.tensorflow.framework.TensorProtoOrBuilder**
- class **org.tensorflow.framework.TensorProtos**
- class **org.tensorflow.framework.TensorShapeProto$Builder**
- class **org.tensorflow.framework.TensorShapeProto$Dim$Builder**
- class **org.tensorflow.framework.TensorShapeProto$Dim**
- interface **org.tensorflow.framework.TensorShapeProto$DimOrBuilder**
- class **org.tensorflow.framework.TensorShapeProto**
- interface **org.tensorflow.framework.TensorShapeProtoOrBuilder**
- class **org.tensorflow.framework.TensorShapeProtos**
- class **org.tensorflow.framework.TensorSliceProto$Builder**
- class **org.tensorflow.framework.TensorSliceProto$Extent$Builder**
- enum **org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase**
- class **org.tensorflow.framework.TensorSliceProto$Extent**
- interface **org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder**
- class **org.tensorflow.framework.TensorSliceProto**
- interface **org.tensorflow.framework.TensorSliceProtoOrBuilder**
- class **org.tensorflow.framework.TensorSliceProtos**
- class **org.tensorflow.framework.TypesProtos**
- class **org.tensorflow.framework.VariableDef$Builder**
- class **org.tensorflow.framework.VariableDef**
- interface **org.tensorflow.framework.VariableDefOrBuilder**
- class **org.tensorflow.framework.VariableProtos**
- class **org.tensorflow.framework.VariantTensorDataProto$Builder**
- class **org.tensorflow.framework.VariantTensorDataProto**
- interface **org.tensorflow.framework.VariantTensorDataProtoOrBuilder**
- class **org.tensorflow.framework.VersionDef$Builder**
- class **org.tensorflow.framework.VersionDef**
- interface **org.tensorflow.framework.VersionDefOrBuilder**
- class **org.tensorflow.framework.VersionsProtos**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
