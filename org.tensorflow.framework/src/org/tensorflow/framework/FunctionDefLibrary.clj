(ns org.tensorflow.framework.FunctionDefLibrary
  " A library is a set of named functions.
 Protobuf type tensorflow.FunctionDefLibrary"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework FunctionDefLibrary]))

(def *-function-field-number
  "Static Constant.

  type: int"
  FunctionDefLibrary/FUNCTION_FIELD_NUMBER)

(def *-gradient-field-number
  "Static Constant.

  type: int"
  FunctionDefLibrary/GRADIENT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (FunctionDefLibrary/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.FunctionDefLibrary`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.FunctionDefLibrary [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (FunctionDefLibrary/parseFrom data extension-registry))
  (^org.tensorflow.framework.FunctionDefLibrary [^java.nio.ByteBuffer data]
    (FunctionDefLibrary/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.FunctionDefLibrary`

  throws: java.io.IOException"
  (^org.tensorflow.framework.FunctionDefLibrary [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (FunctionDefLibrary/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.FunctionDefLibrary [^java.io.InputStream input]
    (FunctionDefLibrary/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.FunctionDefLibrary`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^org.tensorflow.framework.FunctionDefLibrary prototype]
    (FunctionDefLibrary/newBuilder prototype))
  (^org.tensorflow.framework.FunctionDefLibrary$Builder []
    (FunctionDefLibrary/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.FunctionDefLibrary`"
  (^org.tensorflow.framework.FunctionDefLibrary []
    (FunctionDefLibrary/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.FunctionDefLibrary>`"
  (^com.github.os72.protobuf351.Parser []
    (FunctionDefLibrary/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^FunctionDefLibrary this]
    (-> this (.getUnknownFields))))

(defn get-function-list
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `java.util.List<org.tensorflow.framework.FunctionDef>`"
  (^java.util.List [^FunctionDefLibrary this]
    (-> this (.getFunctionList))))

(defn get-function
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDef`"
  (^org.tensorflow.framework.FunctionDef [^FunctionDefLibrary this ^Integer index]
    (-> this (.getFunction index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^FunctionDefLibrary this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.FunctionDefLibrary`"
  (^org.tensorflow.framework.FunctionDefLibrary [^FunctionDefLibrary this]
    (-> this (.getDefaultInstanceForType))))

(defn get-function-or-builder-list
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.FunctionDefOrBuilder>`"
  ([^FunctionDefLibrary this]
    (-> this (.getFunctionOrBuilderList))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^FunctionDefLibrary this]
    (-> this (.getSerializedSize))))

(defn get-function-or-builder
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDefOrBuilder`"
  (^org.tensorflow.framework.FunctionDefOrBuilder [^FunctionDefLibrary this ^Integer index]
    (-> this (.getFunctionOrBuilder index))))

(defn get-gradient-count
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `int`"
  (^Integer [^FunctionDefLibrary this]
    (-> this (.getGradientCount))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^FunctionDefLibrary this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-function-count
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `int`"
  (^Integer [^FunctionDefLibrary this]
    (-> this (.getFunctionCount))))

(defn get-gradient-or-builder-list
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.GradientDefOrBuilder>`"
  ([^FunctionDefLibrary this]
    (-> this (.getGradientOrBuilderList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FunctionDefLibrary this]
    (-> this (.hashCode))))

(defn get-gradient
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`

  returns: `org.tensorflow.framework.GradientDef`"
  (^org.tensorflow.framework.GradientDef [^FunctionDefLibrary this ^Integer index]
    (-> this (.getGradient index))))

(defn get-gradient-list
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `java.util.List<org.tensorflow.framework.GradientDef>`"
  (^java.util.List [^FunctionDefLibrary this]
    (-> this (.getGradientList))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.FunctionDefLibrary>`"
  (^com.github.os72.protobuf351.Parser [^FunctionDefLibrary this]
    (-> this (.getParserForType))))

(defn get-gradient-or-builder
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`

  returns: `org.tensorflow.framework.GradientDefOrBuilder`"
  (^org.tensorflow.framework.GradientDefOrBuilder [^FunctionDefLibrary this ^Integer index]
    (-> this (.getGradientOrBuilder index))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FunctionDefLibrary this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary this]
    (-> this (.toBuilder))))

