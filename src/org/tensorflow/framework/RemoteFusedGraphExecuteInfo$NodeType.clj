(ns org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework RemoteFusedGraphExecuteInfo$NodeType]))

(def UNUSED
  "Enum Constant.

  UNUSED = 0;

  type: org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType"
  RemoteFusedGraphExecuteInfo$NodeType/UNUSED)

(def GRAPH_INPUT
  "Enum Constant.

  GRAPH_INPUT = 1;

  type: org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType"
  RemoteFusedGraphExecuteInfo$NodeType/GRAPH_INPUT)

(def GRAPH_OUTPUT
  "Enum Constant.

  GRAPH_OUTPUT = 2;

  type: org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType"
  RemoteFusedGraphExecuteInfo$NodeType/GRAPH_OUTPUT)

(def FUSED_NODE
  "Enum Constant.

  FUSED_NODE = 3;

  type: org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType"
  RemoteFusedGraphExecuteInfo$NodeType/FUSED_NODE)

(def BORDER_INPUT
  "Enum Constant.

  BORDER_INPUT = 4;

  type: org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType"
  RemoteFusedGraphExecuteInfo$NodeType/BORDER_INPUT)

(def BORDER_OUTPUT
  "Enum Constant.

  BORDER_OUTPUT = 5;

  type: org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType"
  RemoteFusedGraphExecuteInfo$NodeType/BORDER_OUTPUT)

(def UNRECOGNIZED
  "Enum Constant.

  type: org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType"
  RemoteFusedGraphExecuteInfo$NodeType/UNRECOGNIZED)

(def *-unused-value
  "Static Constant.

  UNUSED = 0;

  type: int"
  RemoteFusedGraphExecuteInfo$NodeType/UNUSED_VALUE)

(def *-graph-input-value
  "Static Constant.

  GRAPH_INPUT = 1;

  type: int"
  RemoteFusedGraphExecuteInfo$NodeType/GRAPH_INPUT_VALUE)

(def *-graph-output-value
  "Static Constant.

  GRAPH_OUTPUT = 2;

  type: int"
  RemoteFusedGraphExecuteInfo$NodeType/GRAPH_OUTPUT_VALUE)

(def *-fused-node-value
  "Static Constant.

  FUSED_NODE = 3;

  type: int"
  RemoteFusedGraphExecuteInfo$NodeType/FUSED_NODE_VALUE)

(def *-border-input-value
  "Static Constant.

  BORDER_INPUT = 4;

  type: int"
  RemoteFusedGraphExecuteInfo$NodeType/BORDER_INPUT_VALUE)

(def *-border-output-value
  "Static Constant.

  BORDER_OUTPUT = 5;

  type: int"
  RemoteFusedGraphExecuteInfo$NodeType/BORDER_OUTPUT_VALUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (RemoteFusedGraphExecuteInfo.NodeType c : RemoteFusedGraphExecuteInfo.NodeType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType[]`"
  ([]
    (RemoteFusedGraphExecuteInfo$NodeType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType [^java.lang.String name]
    (RemoteFusedGraphExecuteInfo$NodeType/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType [^Integer value]
    (RemoteFusedGraphExecuteInfo$NodeType/forNumber value)))

(defn *internal-get-value-map
  "returns: `com.github.os72.protobuf351.Internal.EnumLiteMap<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$NodeType>`"
  (^com.github.os72.protobuf351.Internal.EnumLiteMap []
    (RemoteFusedGraphExecuteInfo$NodeType/internalGetValueMap )))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor []
    (RemoteFusedGraphExecuteInfo$NodeType/getDescriptor )))

(defn get-number
  "returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$NodeType this]
    (-> this (.getNumber))))

(defn get-value-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumValueDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumValueDescriptor [^RemoteFusedGraphExecuteInfo$NodeType this]
    (-> this (.getValueDescriptor))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor [^RemoteFusedGraphExecuteInfo$NodeType this]
    (-> this (.getDescriptorForType))))

