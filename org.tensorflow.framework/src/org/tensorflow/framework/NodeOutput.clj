(ns org.tensorflow.framework.NodeOutput
  " Output sizes recorded for a single execution of a graph node.
 Protobuf type tensorflow.NodeOutput"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NodeOutput]))

(def *-slot-field-number
  "Static Constant.

  type: int"
  NodeOutput/SLOT_FIELD_NUMBER)

(def *-tensor-description-field-number
  "Static Constant.

  type: int"
  NodeOutput/TENSOR_DESCRIPTION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (NodeOutput/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NodeOutput`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.NodeOutput [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (NodeOutput/parseFrom data extension-registry))
  (^org.tensorflow.framework.NodeOutput [^java.nio.ByteBuffer data]
    (NodeOutput/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NodeOutput`

  throws: java.io.IOException"
  (^org.tensorflow.framework.NodeOutput [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (NodeOutput/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.NodeOutput [^java.io.InputStream input]
    (NodeOutput/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.NodeOutput`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^org.tensorflow.framework.NodeOutput prototype]
    (NodeOutput/newBuilder prototype))
  (^org.tensorflow.framework.NodeOutput$Builder []
    (NodeOutput/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.NodeOutput`"
  (^org.tensorflow.framework.NodeOutput []
    (NodeOutput/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.NodeOutput>`"
  (^com.github.os72.protobuf351.Parser []
    (NodeOutput/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^NodeOutput this]
    (-> this (.getUnknownFields))))

(defn get-tensor-description
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^NodeOutput this]
    (-> this (.getTensorDescription))))

(defn has-tensor-description?
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `boolean`"
  (^Boolean [^NodeOutput this]
    (-> this (.hasTensorDescription))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^NodeOutput this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.NodeOutput`"
  (^org.tensorflow.framework.NodeOutput [^NodeOutput this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^NodeOutput this]
    (-> this (.getSerializedSize))))

(defn get-tensor-description-or-builder
  ".tensorflow.TensorDescription tensor_description = 3;

  returns: `org.tensorflow.framework.TensorDescriptionOrBuilder`"
  (^org.tensorflow.framework.TensorDescriptionOrBuilder [^NodeOutput this]
    (-> this (.getTensorDescriptionOrBuilder))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^NodeOutput this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeOutput this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.NodeOutput>`"
  (^com.github.os72.protobuf351.Parser [^NodeOutput this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeOutput this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput this]
    (-> this (.newBuilderForType))))

(defn get-slot
  "int32 slot = 1;

  returns: `int`"
  (^Integer [^NodeOutput this]
    (-> this (.getSlot))))

(defn to-builder
  "returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeOutput this]
    (-> this (.toBuilder))))

