(ns org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto
  "Protobuf type tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework RemoteFusedGraphExecuteInfo$TensorShapeTypeProto]))

(def *-dtype-field-number
  "Static Constant.

  type: int"
  RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/DTYPE_FIELD_NUMBER)

(def *-shape-field-number
  "Static Constant.

  type: int"
  RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/SHAPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/parseFrom data extension-registry))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^java.nio.ByteBuffer data]
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`

  throws: java.io.IOException"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^java.io.InputStream input]
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto prototype]
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/newBuilder prototype))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder []
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto []
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto>`"
  (^com.github.os72.protobuf351.Parser []
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.getUnknownFields))))

(defn has-shape?
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.hasShape))))

(defn get-dtype
  ".tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.getDtype))))

(defn get-shape-or-builder
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.getShapeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 1;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.getDtypeValue))))

(defn get-shape
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.getShape))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto>`"
  (^com.github.os72.protobuf351.Parser [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto this]
    (-> this (.toBuilder))))

