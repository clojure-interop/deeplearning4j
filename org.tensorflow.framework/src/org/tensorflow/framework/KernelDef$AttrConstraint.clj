(ns org.tensorflow.framework.KernelDef$AttrConstraint
  "Protobuf type tensorflow.KernelDef.AttrConstraint"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework KernelDef$AttrConstraint]))

(def *-name-field-number
  "Static Constant.

  type: int"
  KernelDef$AttrConstraint/NAME_FIELD_NUMBER)

(def *-allowed-values-field-number
  "Static Constant.

  type: int"
  KernelDef$AttrConstraint/ALLOWED_VALUES_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (KernelDef$AttrConstraint/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (KernelDef$AttrConstraint/parseFrom data extension-registry))
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^java.nio.ByteBuffer data]
    (KernelDef$AttrConstraint/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint`

  throws: java.io.IOException"
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (KernelDef$AttrConstraint/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^java.io.InputStream input]
    (KernelDef$AttrConstraint/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.KernelDef$AttrConstraint`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^org.tensorflow.framework.KernelDef$AttrConstraint prototype]
    (KernelDef$AttrConstraint/newBuilder prototype))
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder []
    (KernelDef$AttrConstraint/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.KernelDef$AttrConstraint`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint []
    (KernelDef$AttrConstraint/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.KernelDef$AttrConstraint>`"
  (^com.github.os72.protobuf351.Parser []
    (KernelDef$AttrConstraint/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^KernelDef$AttrConstraint this]
    (-> this (.getUnknownFields))))

(defn get-allowed-values
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^KernelDef$AttrConstraint this]
    (-> this (.getAllowedValues))))

(defn get-allowed-values-or-builder
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^KernelDef$AttrConstraint this]
    (-> this (.getAllowedValuesOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^KernelDef$AttrConstraint this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.KernelDef$AttrConstraint`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^KernelDef$AttrConstraint this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "Name of an attr from the Op.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef$AttrConstraint this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^KernelDef$AttrConstraint this]
    (-> this (.getSerializedSize))))

(defn get-name
  "Name of an attr from the Op.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef$AttrConstraint this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^KernelDef$AttrConstraint this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn has-allowed-values?
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `boolean`"
  (^Boolean [^KernelDef$AttrConstraint this]
    (-> this (.hasAllowedValues))))

(defn hash-code
  "returns: `int`"
  (^Integer [^KernelDef$AttrConstraint this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.KernelDef$AttrConstraint>`"
  (^com.github.os72.protobuf351.Parser [^KernelDef$AttrConstraint this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^KernelDef$AttrConstraint this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint this]
    (-> this (.toBuilder))))

