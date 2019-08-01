(ns org.tensorflow.framework.GradientDef
  " GradientDef defines the gradient function of a function defined in
  a function library.
  A gradient function g (specified by gradient_func) for a function f
  (specified by function_name) must follow the following:
  The function 'f' must be a numerical function which takes N inputs
  and produces M outputs. Its gradient function 'g', which is a
  function taking N  M inputs and produces N outputs.
  I.e. if we have
     (y1, y2, ..., y_M) = f(x1, x2, ..., x_N),
  then, g is
     (dL/dx1, dL/dx2, ..., dL/dx_N) = g(x1, x2, ..., x_N,
                                       dL/dy1, dL/dy2, ..., dL/dy_M),
  where L is a scalar-value function of (x1, x2, ..., xN) (e.g., the
  loss function). dL/dx_i is the partial derivative of L with respect
  to x_i.
 Protobuf type tensorflow.GradientDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GradientDef]))

(def *-function-name-field-number
  "Static Constant.

  type: int"
  GradientDef/FUNCTION_NAME_FIELD_NUMBER)

(def *-gradient-func-field-number
  "Static Constant.

  type: int"
  GradientDef/GRADIENT_FUNC_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GradientDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GradientDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GradientDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GradientDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.GradientDef [^java.nio.ByteBuffer data]
    (GradientDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GradientDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GradientDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GradientDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GradientDef [^java.io.InputStream input]
    (GradientDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GradientDef`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^org.tensorflow.framework.GradientDef prototype]
    (GradientDef/newBuilder prototype))
  (^org.tensorflow.framework.GradientDef$Builder []
    (GradientDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GradientDef`"
  (^org.tensorflow.framework.GradientDef []
    (GradientDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GradientDef>`"
  (^com.github.os72.protobuf351.Parser []
    (GradientDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GradientDef this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GradientDef this]
    (-> this (.isInitialized))))

(defn get-function-name-bytes
  "The function name.
  string function_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GradientDef this]
    (-> this (.getFunctionNameBytes))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GradientDef`"
  (^org.tensorflow.framework.GradientDef [^GradientDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GradientDef this]
    (-> this (.getSerializedSize))))

(defn get-function-name
  "The function name.
  string function_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GradientDef this]
    (-> this (.getFunctionName))))

(defn get-gradient-func
  "The gradient function's name.
  string gradient_func = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^GradientDef this]
    (-> this (.getGradientFunc))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GradientDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-gradient-func-bytes
  "The gradient function's name.
  string gradient_func = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GradientDef this]
    (-> this (.getGradientFuncBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GradientDef this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GradientDef>`"
  (^com.github.os72.protobuf351.Parser [^GradientDef this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GradientDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef this]
    (-> this (.toBuilder))))

