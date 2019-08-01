(ns onnx.OnnxProto3$NodeProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$NodeProtoOrBuilder]))

(defn get-op-type
  "The symbolic identifier of the Operator to execute.
  string op_type = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getOpType))))

(defn get-attribute-or-builder
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`

  returns: `onnx.OnnxProto3$AttributeProtoOrBuilder`"
  (^onnx.OnnxProto3$AttributeProtoOrBuilder [^OnnxProto3$NodeProtoOrBuilder this ^Integer index]
    (-> this (.getAttributeOrBuilder index))))

(defn get-doc-string-bytes
  "A human-readable documentation for this node. Markdown is allowed.
  string doc_string = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getDocStringBytes))))

(defn get-name-bytes
  "An optional identifier for this node in a graph.
   This field MAY be absent in ths version of the IR.
  string name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "namespace Value
  repeated string input = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getInputCount))))

(defn get-domain-bytes
  "The domain of the OperatorSet that specifies the operator named by op_type.
  string domain = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getDomainBytes))))

(defn get-input-bytes
  "namespace Value
  repeated string input = 1;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProtoOrBuilder this ^Integer index]
    (-> this (.getInputBytes index))))

(defn get-op-type-bytes
  "The symbolic identifier of the Operator to execute.
  string op_type = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getOpTypeBytes))))

(defn get-attribute-count
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `int`"
  (^Integer [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getAttributeCount))))

(defn get-input-list
  "namespace Value
  repeated string input = 1;

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getInputList))))

(defn get-doc-string
  "A human-readable documentation for this node. Markdown is allowed.
  string doc_string = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getDocString))))

(defn get-attribute
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`

  returns: `onnx.OnnxProto3$AttributeProto`"
  (^onnx.OnnxProto3$AttributeProto [^OnnxProto3$NodeProtoOrBuilder this ^Integer index]
    (-> this (.getAttribute index))))

(defn get-name
  "An optional identifier for this node in a graph.
   This field MAY be absent in ths version of the IR.
  string name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getName))))

(defn get-output-list
  "namespace Value
  repeated string output = 2;

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getOutputList))))

(defn get-input
  "namespace Value
  repeated string input = 1;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProtoOrBuilder this ^Integer index]
    (-> this (.getInput index))))

(defn get-attribute-or-builder-list
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `java.util.List<? extends onnx.OnnxProto3$AttributeProtoOrBuilder>`"
  ([^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getAttributeOrBuilderList))))

(defn get-output-count
  "namespace Value
  repeated string output = 2;

  returns: `int`"
  (^Integer [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getOutputCount))))

(defn get-output-bytes
  "namespace Value
  repeated string output = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProtoOrBuilder this ^Integer index]
    (-> this (.getOutputBytes index))))

(defn get-domain
  "The domain of the OperatorSet that specifies the operator named by op_type.
  string domain = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getDomain))))

(defn get-attribute-list
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `java.util.List<onnx.OnnxProto3$AttributeProto>`"
  (^java.util.List [^OnnxProto3$NodeProtoOrBuilder this]
    (-> this (.getAttributeList))))

(defn get-output
  "namespace Value
  repeated string output = 2;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProtoOrBuilder this ^Integer index]
    (-> this (.getOutput index))))

