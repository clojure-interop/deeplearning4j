(ns onnx.OnnxProto3$NodeProto
  " NodeProto stores a node that is similar to the notion of \"layer\"
  or \"operator\" in many deep learning frameworks. For example, it can be a
  node of type \"Conv\" that takes in an image, a filter tensor and a bias
  tensor, and produces the convolved output.
 Protobuf type onnx.NodeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$NodeProto]))

(def *-input-field-number
  "Static Constant.

  type: int"
  OnnxProto3$NodeProto/INPUT_FIELD_NUMBER)

(def *-output-field-number
  "Static Constant.

  type: int"
  OnnxProto3$NodeProto/OUTPUT_FIELD_NUMBER)

(def *-name-field-number
  "Static Constant.

  type: int"
  OnnxProto3$NodeProto/NAME_FIELD_NUMBER)

(def *-op-type-field-number
  "Static Constant.

  type: int"
  OnnxProto3$NodeProto/OP_TYPE_FIELD_NUMBER)

(def *-domain-field-number
  "Static Constant.

  type: int"
  OnnxProto3$NodeProto/DOMAIN_FIELD_NUMBER)

(def *-attribute-field-number
  "Static Constant.

  type: int"
  OnnxProto3$NodeProto/ATTRIBUTE_FIELD_NUMBER)

(def *-doc-string-field-number
  "Static Constant.

  type: int"
  OnnxProto3$NodeProto/DOC_STRING_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$NodeProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$NodeProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$NodeProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$NodeProto/parseFrom data extension-registry))
  (^onnx.OnnxProto3$NodeProto [^java.nio.ByteBuffer data]
    (OnnxProto3$NodeProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$NodeProto`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$NodeProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$NodeProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$NodeProto [^java.io.InputStream input]
    (OnnxProto3$NodeProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$NodeProto`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^onnx.OnnxProto3$NodeProto prototype]
    (OnnxProto3$NodeProto/newBuilder prototype))
  (^onnx.OnnxProto3$NodeProto$Builder []
    (OnnxProto3$NodeProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$NodeProto`"
  (^onnx.OnnxProto3$NodeProto []
    (OnnxProto3$NodeProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$NodeProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$NodeProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$NodeProto this]
    (-> this (.getUnknownFields))))

(defn get-op-type
  "The symbolic identifier of the Operator to execute.
  string op_type = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto this]
    (-> this (.getOpType))))

(defn get-attribute-or-builder
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`

  returns: `onnx.OnnxProto3$AttributeProtoOrBuilder`"
  (^onnx.OnnxProto3$AttributeProtoOrBuilder [^OnnxProto3$NodeProto this ^Integer index]
    (-> this (.getAttributeOrBuilder index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$NodeProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$NodeProto`"
  (^onnx.OnnxProto3$NodeProto [^OnnxProto3$NodeProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-doc-string-bytes
  "A human-readable documentation for this node. Markdown is allowed.
  string doc_string = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto this]
    (-> this (.getDocStringBytes))))

(defn get-name-bytes
  "An optional identifier for this node in a graph.
   This field MAY be absent in ths version of the IR.
  string name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "namespace Value
  repeated string input = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$NodeProto this]
    (-> this (.getInputCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$NodeProto this]
    (-> this (.getSerializedSize))))

(defn get-domain-bytes
  "The domain of the OperatorSet that specifies the operator named by op_type.
  string domain = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto this]
    (-> this (.getDomainBytes))))

(defn get-input-bytes
  "namespace Value
  repeated string input = 1;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto this ^Integer index]
    (-> this (.getInputBytes index))))

(defn get-op-type-bytes
  "The symbolic identifier of the Operator to execute.
  string op_type = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto this]
    (-> this (.getOpTypeBytes))))

(defn get-attribute-count
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `int`"
  (^Integer [^OnnxProto3$NodeProto this]
    (-> this (.getAttributeCount))))

(defn get-input-list
  "namespace Value
  repeated string input = 1;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^OnnxProto3$NodeProto this]
    (-> this (.getInputList))))

(defn get-doc-string
  "A human-readable documentation for this node. Markdown is allowed.
  string doc_string = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto this]
    (-> this (.getDocString))))

(defn get-attribute
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`

  returns: `onnx.OnnxProto3$AttributeProto`"
  (^onnx.OnnxProto3$AttributeProto [^OnnxProto3$NodeProto this ^Integer index]
    (-> this (.getAttribute index))))

(defn get-name
  "An optional identifier for this node in a graph.
   This field MAY be absent in ths version of the IR.
  string name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto this]
    (-> this (.getName))))

(defn get-output-list
  "namespace Value
  repeated string output = 2;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^OnnxProto3$NodeProto this]
    (-> this (.getOutputList))))

(defn get-input
  "namespace Value
  repeated string input = 1;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto this ^Integer index]
    (-> this (.getInput index))))

(defn get-attribute-or-builder-list
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `java.util.List<? extends onnx.OnnxProto3$AttributeProtoOrBuilder>`"
  ([^OnnxProto3$NodeProto this]
    (-> this (.getAttributeOrBuilderList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$NodeProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-output-count
  "namespace Value
  repeated string output = 2;

  returns: `int`"
  (^Integer [^OnnxProto3$NodeProto this]
    (-> this (.getOutputCount))))

(defn get-output-bytes
  "namespace Value
  repeated string output = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto this ^Integer index]
    (-> this (.getOutputBytes index))))

(defn get-domain
  "The domain of the OperatorSet that specifies the operator named by op_type.
  string domain = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto this]
    (-> this (.getDomain))))

(defn get-attribute-list
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `java.util.List<onnx.OnnxProto3$AttributeProto>`"
  (^java.util.List [^OnnxProto3$NodeProto this]
    (-> this (.getAttributeList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$NodeProto this]
    (-> this (.hashCode))))

(defn get-output
  "namespace Value
  repeated string output = 2;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto this ^Integer index]
    (-> this (.getOutput index))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$NodeProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$NodeProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$NodeProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto this]
    (-> this (.toBuilder))))

