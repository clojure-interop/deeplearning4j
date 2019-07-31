(ns org.tensorflow.framework.FunctionDefLibrary$Builder
  " A library is a set of named functions.
 Protobuf type tensorflow.FunctionDefLibrary"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework FunctionDefLibrary$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (FunctionDefLibrary$Builder/getDescriptor )))

(defn get-function-list
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `java.util.List<org.tensorflow.framework.FunctionDef>`"
  (^java.util.List [^FunctionDefLibrary$Builder this]
    (-> this (.getFunctionList))))

(defn add-gradient
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`
  value - `org.tensorflow.framework.GradientDef`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^Integer index ^org.tensorflow.framework.GradientDef value]
    (-> this (.addGradient index value)))
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^org.tensorflow.framework.GradientDef value]
    (-> this (.addGradient value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.FunctionDefLibrary`"
  (^org.tensorflow.framework.FunctionDefLibrary [^FunctionDefLibrary$Builder this]
    (-> this (.buildPartial))))

(defn get-function
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDef`"
  (^org.tensorflow.framework.FunctionDef [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.getFunction index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^FunctionDefLibrary$Builder this]
    (-> this (.isInitialized))))

(defn get-function-builder-list
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `java.util.List<org.tensorflow.framework.FunctionDef$Builder>`"
  (^java.util.List [^FunctionDefLibrary$Builder this]
    (-> this (.getFunctionBuilderList))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.FunctionDefLibrary`"
  (^org.tensorflow.framework.FunctionDefLibrary [^FunctionDefLibrary$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn remove-gradient
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.removeGradient index))))

(defn get-function-or-builder-list
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.FunctionDefOrBuilder>`"
  ([^FunctionDefLibrary$Builder this]
    (-> this (.getFunctionOrBuilderList))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn add-function
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`
  value - `org.tensorflow.framework.FunctionDef`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^Integer index ^org.tensorflow.framework.FunctionDef value]
    (-> this (.addFunction index value)))
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^org.tensorflow.framework.FunctionDef value]
    (-> this (.addFunction value))))

(defn remove-function
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.removeFunction index))))

(defn get-function-or-builder
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDefOrBuilder`"
  (^org.tensorflow.framework.FunctionDefOrBuilder [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.getFunctionOrBuilder index))))

(defn get-gradient-count
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `int`"
  (^Integer [^FunctionDefLibrary$Builder this]
    (-> this (.getGradientCount))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-all-function
  "repeated .tensorflow.FunctionDef function = 1;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^java.lang.Iterable values]
    (-> this (.addAllFunction values))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn add-function-builder
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.addFunctionBuilder index)))
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDefLibrary$Builder this]
    (-> this (.addFunctionBuilder))))

(defn set-function
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`
  value - `org.tensorflow.framework.FunctionDef`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^Integer index ^org.tensorflow.framework.FunctionDef value]
    (-> this (.setFunction index value))))

(defn build
  "returns: `org.tensorflow.framework.FunctionDefLibrary`"
  (^org.tensorflow.framework.FunctionDefLibrary [^FunctionDefLibrary$Builder this]
    (-> this (.build))))

(defn get-function-count
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `int`"
  (^Integer [^FunctionDefLibrary$Builder this]
    (-> this (.getFunctionCount))))

(defn set-gradient
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`
  value - `org.tensorflow.framework.GradientDef`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^Integer index ^org.tensorflow.framework.GradientDef value]
    (-> this (.setGradient index value))))

(defn get-gradient-builder
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.getGradientBuilder index))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-gradient
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this]
    (-> this (.clearGradient))))

(defn add-all-gradient
  "repeated .tensorflow.GradientDef gradient = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^java.lang.Iterable values]
    (-> this (.addAllGradient values))))

(defn clear-function
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this]
    (-> this (.clearFunction))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-gradient-or-builder-list
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.GradientDefOrBuilder>`"
  ([^FunctionDefLibrary$Builder this]
    (-> this (.getGradientOrBuilderList))))

(defn clone
  "returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this]
    (-> this (.clone))))

(defn get-function-builder
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.getFunctionBuilder index))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^FunctionDefLibrary$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-gradient-builder-list
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `java.util.List<org.tensorflow.framework.GradientDef$Builder>`"
  (^java.util.List [^FunctionDefLibrary$Builder this]
    (-> this (.getGradientBuilderList))))

(defn add-gradient-builder
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`

  returns: `org.tensorflow.framework.GradientDef$Builder`"
  (^org.tensorflow.framework.GradientDef$Builder [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.addGradientBuilder index)))
  (^org.tensorflow.framework.GradientDef$Builder [^FunctionDefLibrary$Builder this]
    (-> this (.addGradientBuilder))))

(defn get-gradient
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`

  returns: `org.tensorflow.framework.GradientDef`"
  (^org.tensorflow.framework.GradientDef [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.getGradient index))))

(defn get-gradient-list
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `java.util.List<org.tensorflow.framework.GradientDef>`"
  (^java.util.List [^FunctionDefLibrary$Builder this]
    (-> this (.getGradientList))))

(defn get-gradient-or-builder
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`

  returns: `org.tensorflow.framework.GradientDefOrBuilder`"
  (^org.tensorflow.framework.GradientDefOrBuilder [^FunctionDefLibrary$Builder this ^Integer index]
    (-> this (.getGradientOrBuilder index))))

(defn clear
  "returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^FunctionDefLibrary$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

