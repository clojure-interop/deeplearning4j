(ns org.tensorflow.framework.GradientDef$Builder
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
  (:import [org.tensorflow.framework GradientDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GradientDef$Builder/getDescriptor )))

(defn set-gradient-func-bytes
  "The gradient function's name.
  string gradient_func = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setGradientFuncBytes value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.GradientDef`"
  (^org.tensorflow.framework.GradientDef [^GradientDef$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GradientDef$Builder this]
    (-> this (.isInitialized))))

(defn get-function-name-bytes
  "The function name.
  string function_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GradientDef$Builder this]
    (-> this (.getFunctionNameBytes))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GradientDef`"
  (^org.tensorflow.framework.GradientDef [^GradientDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-function-name
  "The function name.
  string function_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GradientDef$Builder this]
    (-> this (.getFunctionName))))

(defn set-function-name
  "The function name.
  string function_name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^java.lang.String value]
    (-> this (.setFunctionName value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-gradient-func
  "The gradient function's name.
  string gradient_func = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^GradientDef$Builder this]
    (-> this (.getGradientFunc))))

(defn set-gradient-func
  "The gradient function's name.
  string gradient_func = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^java.lang.String value]
    (-> this (.setGradientFunc value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.GradientDef`"
  (^org.tensorflow.framework.GradientDef [^GradientDef$Builder this]
    (-> this (.build))))

(defn get-gradient-func-bytes
  "The gradient function's name.
  string gradient_func = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GradientDef$Builder this]
    (-> this (.getGradientFuncBytes))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GradientDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-function-name-bytes
  "The function name.
  string function_name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setFunctionNameBytes value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^GradientDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this]
    (-> this (.clear))))

(defn clear-gradient-func
  "The gradient function's name.
  string gradient_func = 2;

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this]
    (-> this (.clearGradientFunc))))

(defn clear-function-name
  "The function name.
  string function_name = 1;

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this]
    (-> this (.clearFunctionName))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^GradientDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

