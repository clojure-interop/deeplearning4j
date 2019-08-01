(ns org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder
  " Outputs of this node.
 Protobuf type tensorflow.CostGraphDef.Node.OutputInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$Node$OutputInfo$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (CostGraphDef$Node$OutputInfo$Builder/getDescriptor )))

(defn has-shape?
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.hasShape))))

(defn get-dtype
  ".tensorflow.DataType dtype = 4;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.getDtype))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.buildPartial))))

(defn clear-dtype
  ".tensorflow.DataType dtype = 4;

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.clearDtype))))

(defn get-shape-or-builder
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.getShapeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn set-alias-input-port
  "If >= 0, the output is an alias of an input. Note that an alias input
   may itself be an alias. The algorithm will therefore need to follow
   those pointers.
  int64 alias_input_port = 2;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^Long value]
    (-> this (.setAliasInputPort value))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-shape
  ".tensorflow.TensorShapeProto shape = 3;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.setShape value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-dtype
  ".tensorflow.DataType dtype = 4;

  value - `org.tensorflow.framework.DataType`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^org.tensorflow.framework.DataType value]
    (-> this (.setDtype value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.build))))

(defn merge-shape
  ".tensorflow.TensorShapeProto shape = 3;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.mergeShape value))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 4;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.getDtypeValue))))

(defn get-shape-builder
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.getShapeBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-shape
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.getShape))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn set-size
  "int64 size = 1;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^Long value]
    (-> this (.setSize value))))

(defn get-alias-input-port
  "If >= 0, the output is an alias of an input. Note that an alias input
   may itself be an alias. The algorithm will therefore need to follow
   those pointers.
  int64 alias_input_port = 2;

  returns: `long`"
  (^Long [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.getAliasInputPort))))

(defn clone
  "returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-shape
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.clearShape))))

(defn clear
  "returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-size
  "int64 size = 1;

  returns: `long`"
  (^Long [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.getSize))))

(defn clear-size
  "int64 size = 1;

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.clearSize))))

(defn set-dtype-value
  ".tensorflow.DataType dtype = 4;

  value - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this ^Integer value]
    (-> this (.setDtypeValue value))))

(defn clear-alias-input-port
  "If >= 0, the output is an alias of an input. Note that an alias input
   may itself be an alias. The algorithm will therefore need to follow
   those pointers.
  int64 alias_input_port = 2;

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo$Builder this]
    (-> this (.clearAliasInputPort))))

