(ns org.tensorflow.framework.GraphTransferInfo$Destination
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$Destination]))

(def NOP
  "Enum Constant.

  NOP = 0;

  type: org.tensorflow.framework.GraphTransferInfo$Destination"
  GraphTransferInfo$Destination/NOP)

(def HEXAGON
  "Enum Constant.

  HEXAGON = 1;

  type: org.tensorflow.framework.GraphTransferInfo$Destination"
  GraphTransferInfo$Destination/HEXAGON)

(def UNRECOGNIZED
  "Enum Constant.

  type: org.tensorflow.framework.GraphTransferInfo$Destination"
  GraphTransferInfo$Destination/UNRECOGNIZED)

(def *-nop-value
  "Static Constant.

  NOP = 0;

  type: int"
  GraphTransferInfo$Destination/NOP_VALUE)

(def *-hexagon-value
  "Static Constant.

  HEXAGON = 1;

  type: int"
  GraphTransferInfo$Destination/HEXAGON_VALUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (GraphTransferInfo.Destination c : GraphTransferInfo.Destination.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.tensorflow.framework.GraphTransferInfo$Destination[]`"
  ([]
    (GraphTransferInfo$Destination/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.tensorflow.framework.GraphTransferInfo$Destination`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.tensorflow.framework.GraphTransferInfo$Destination [^java.lang.String name]
    (GraphTransferInfo$Destination/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$Destination`"
  (^org.tensorflow.framework.GraphTransferInfo$Destination [^Integer value]
    (GraphTransferInfo$Destination/forNumber value)))

(defn *internal-get-value-map
  "returns: `com.github.os72.protobuf351.Internal.EnumLiteMap<org.tensorflow.framework.GraphTransferInfo$Destination>`"
  (^com.github.os72.protobuf351.Internal.EnumLiteMap []
    (GraphTransferInfo$Destination/internalGetValueMap )))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor []
    (GraphTransferInfo$Destination/getDescriptor )))

(defn get-number
  "returns: `int`"
  (^Integer [^GraphTransferInfo$Destination this]
    (-> this (.getNumber))))

(defn get-value-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumValueDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumValueDescriptor [^GraphTransferInfo$Destination this]
    (-> this (.getValueDescriptor))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor [^GraphTransferInfo$Destination this]
    (-> this (.getDescriptorForType))))

