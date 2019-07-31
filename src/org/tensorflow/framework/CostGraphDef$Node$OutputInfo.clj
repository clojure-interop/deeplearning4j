(ns org.tensorflow.framework.CostGraphDef$Node$OutputInfo
  " Outputs of this node.
 Protobuf type tensorflow.CostGraphDef.Node.OutputInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$Node$OutputInfo]))

(def *-size-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node$OutputInfo/SIZE_FIELD_NUMBER)

(def *-alias-input-port-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node$OutputInfo/ALIAS_INPUT_PORT_FIELD_NUMBER)

(def *-shape-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node$OutputInfo/SHAPE_FIELD_NUMBER)

(def *-dtype-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node$OutputInfo/DTYPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (CostGraphDef$Node$OutputInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (CostGraphDef$Node$OutputInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^java.nio.ByteBuffer data]
    (CostGraphDef$Node$OutputInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (CostGraphDef$Node$OutputInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^java.io.InputStream input]
    (CostGraphDef$Node$OutputInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^org.tensorflow.framework.CostGraphDef$Node$OutputInfo prototype]
    (CostGraphDef$Node$OutputInfo/newBuilder prototype))
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder []
    (CostGraphDef$Node$OutputInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo []
    (CostGraphDef$Node$OutputInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.CostGraphDef$Node$OutputInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (CostGraphDef$Node$OutputInfo/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getUnknownFields))))

(defn has-shape?
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$OutputInfo this]
    (-> this (.hasShape))))

(defn get-dtype
  ".tensorflow.DataType dtype = 4;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getDtype))))

(defn get-shape-or-builder
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getShapeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$OutputInfo this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^CostGraphDef$Node$OutputInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 4;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getDtypeValue))))

(defn get-shape
  ".tensorflow.TensorShapeProto shape = 3;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getShape))))

(defn get-alias-input-port
  "If >= 0, the output is an alias of an input. Note that an alias input
   may itself be an alias. The algorithm will therefore need to follow
   those pointers.
  int64 alias_input_port = 2;

  returns: `long`"
  (^Long [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getAliasInputPort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CostGraphDef$Node$OutputInfo this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.CostGraphDef$Node$OutputInfo>`"
  (^com.github.os72.protobuf351.Parser [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getParserForType))))

(defn get-size
  "int64 size = 1;

  returns: `long`"
  (^Long [^CostGraphDef$Node$OutputInfo this]
    (-> this (.getSize))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$OutputInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$OutputInfo this]
    (-> this (.toBuilder))))

