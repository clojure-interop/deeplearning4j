(ns org.tensorflow.framework.ApiDef$Visibility
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef$Visibility]))

(def DEFAULT_VISIBILITY
  "Enum Constant.

  Normally this is \"VISIBLE\" unless you are inheriting a
   different value from another ApiDef.
  DEFAULT_VISIBILITY = 0;

  type: org.tensorflow.framework.ApiDef$Visibility"
  ApiDef$Visibility/DEFAULT_VISIBILITY)

(def VISIBLE
  "Enum Constant.

  Publicly visible in the API.
  VISIBLE = 1;

  type: org.tensorflow.framework.ApiDef$Visibility"
  ApiDef$Visibility/VISIBLE)

(def SKIP
  "Enum Constant.

  Do not include this op in the generated API. If visibility is
   set to 'SKIP', other fields are ignored for this op.
  SKIP = 2;

  type: org.tensorflow.framework.ApiDef$Visibility"
  ApiDef$Visibility/SKIP)

(def HIDDEN
  "Enum Constant.

  Hide this op by putting it into an internal namespace (or whatever
   is appropriate in the target language).
  HIDDEN = 3;

  type: org.tensorflow.framework.ApiDef$Visibility"
  ApiDef$Visibility/HIDDEN)

(def UNRECOGNIZED
  "Enum Constant.

  type: org.tensorflow.framework.ApiDef$Visibility"
  ApiDef$Visibility/UNRECOGNIZED)

(def *-default-visibility-value
  "Static Constant.

  Normally this is \"VISIBLE\" unless you are inheriting a
   different value from another ApiDef.
  DEFAULT_VISIBILITY = 0;

  type: int"
  ApiDef$Visibility/DEFAULT_VISIBILITY_VALUE)

(def *-visible-value
  "Static Constant.

  Publicly visible in the API.
  VISIBLE = 1;

  type: int"
  ApiDef$Visibility/VISIBLE_VALUE)

(def *-skip-value
  "Static Constant.

  Do not include this op in the generated API. If visibility is
   set to 'SKIP', other fields are ignored for this op.
  SKIP = 2;

  type: int"
  ApiDef$Visibility/SKIP_VALUE)

(def *-hidden-value
  "Static Constant.

  Hide this op by putting it into an internal namespace (or whatever
   is appropriate in the target language).
  HIDDEN = 3;

  type: int"
  ApiDef$Visibility/HIDDEN_VALUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ApiDef.Visibility c : ApiDef.Visibility.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.tensorflow.framework.ApiDef$Visibility[]`"
  ([]
    (ApiDef$Visibility/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.tensorflow.framework.ApiDef$Visibility`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.tensorflow.framework.ApiDef$Visibility [^java.lang.String name]
    (ApiDef$Visibility/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `org.tensorflow.framework.ApiDef$Visibility`"
  (^org.tensorflow.framework.ApiDef$Visibility [^Integer value]
    (ApiDef$Visibility/forNumber value)))

(defn *internal-get-value-map
  "returns: `com.github.os72.protobuf351.Internal.EnumLiteMap<org.tensorflow.framework.ApiDef$Visibility>`"
  (^com.github.os72.protobuf351.Internal.EnumLiteMap []
    (ApiDef$Visibility/internalGetValueMap )))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor []
    (ApiDef$Visibility/getDescriptor )))

(defn get-number
  "returns: `int`"
  (^Integer [^ApiDef$Visibility this]
    (-> this (.getNumber))))

(defn get-value-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumValueDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumValueDescriptor [^ApiDef$Visibility this]
    (-> this (.getValueDescriptor))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor [^ApiDef$Visibility this]
    (-> this (.getDescriptorForType))))

