(ns onnx.OnnxProto3$NodeProto$Builder
  " NodeProto stores a node that is similar to the notion of \"layer\"
  or \"operator\" in many deep learning frameworks. For example, it can be a
  node of type \"Conv\" that takes in an image, a filter tensor and a bias
  tensor, and produces the convolved output.
 Protobuf type onnx.NodeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$NodeProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$NodeProto$Builder/getDescriptor )))

(defn clear-doc-string
  "A human-readable documentation for this node. Markdown is allowed.
  string doc_string = 6;

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.clearDocString))))

(defn clear-output
  "namespace Value
  repeated string output = 2;

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.clearOutput))))

(defn clear-name
  "An optional identifier for this node in a graph.
   This field MAY be absent in ths version of the IR.
  string name = 3;

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.clearName))))

(defn set-input
  "namespace Value
  repeated string input = 1;

  index - `int`
  value - `java.lang.String`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^Integer index ^java.lang.String value]
    (-> this (.setInput index value))))

(defn clear-domain
  "The domain of the OperatorSet that specifies the operator named by op_type.
  string domain = 7;

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.clearDomain))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-attribute-builder-list
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `java.util.List<onnx.OnnxProto3$AttributeProto$Builder>`"
  (^java.util.List [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getAttributeBuilderList))))

(defn get-op-type
  "The symbolic identifier of the Operator to execute.
  string op_type = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getOpType))))

(defn build-partial
  "returns: `onnx.OnnxProto3$NodeProto`"
  (^onnx.OnnxProto3$NodeProto [^OnnxProto3$NodeProto$Builder this]
    (-> this (.buildPartial))))

(defn set-doc-string
  "A human-readable documentation for this node. Markdown is allowed.
  string doc_string = 6;

  value - `java.lang.String`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^java.lang.String value]
    (-> this (.setDocString value))))

(defn get-attribute-or-builder
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`

  returns: `onnx.OnnxProto3$AttributeProtoOrBuilder`"
  (^onnx.OnnxProto3$AttributeProtoOrBuilder [^OnnxProto3$NodeProto$Builder this ^Integer index]
    (-> this (.getAttributeOrBuilder index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$NodeProto$Builder this]
    (-> this (.isInitialized))))

(defn set-op-type-bytes
  "The symbolic identifier of the Operator to execute.
  string op_type = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setOpTypeBytes value))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$NodeProto`"
  (^onnx.OnnxProto3$NodeProto [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn add-all-attribute
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllAttribute values))))

(defn get-doc-string-bytes
  "A human-readable documentation for this node. Markdown is allowed.
  string doc_string = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getDocStringBytes))))

(defn set-op-type
  "The symbolic identifier of the Operator to execute.
  string op_type = 4;

  value - `java.lang.String`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^java.lang.String value]
    (-> this (.setOpType value))))

(defn set-doc-string-bytes
  "A human-readable documentation for this node. Markdown is allowed.
  string doc_string = 6;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDocStringBytes value))))

(defn get-name-bytes
  "An optional identifier for this node in a graph.
   This field MAY be absent in ths version of the IR.
  string name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "namespace Value
  repeated string input = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getInputCount))))

(defn get-domain-bytes
  "The domain of the OperatorSet that specifies the operator named by op_type.
  string domain = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getDomainBytes))))

(defn set-output
  "namespace Value
  repeated string output = 2;

  index - `int`
  value - `java.lang.String`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^Integer index ^java.lang.String value]
    (-> this (.setOutput index value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-attribute
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.clearAttribute))))

(defn set-name
  "An optional identifier for this node in a graph.
   This field MAY be absent in ths version of the IR.
  string name = 3;

  value - `java.lang.String`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-input-bytes
  "namespace Value
  repeated string input = 1;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto$Builder this ^Integer index]
    (-> this (.getInputBytes index))))

(defn get-op-type-bytes
  "The symbolic identifier of the Operator to execute.
  string op_type = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getOpTypeBytes))))

(defn add-all-input
  "namespace Value
  repeated string input = 1;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInput values))))

(defn get-attribute-count
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `int`"
  (^Integer [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getAttributeCount))))

(defn get-input-list
  "namespace Value
  repeated string input = 1;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getInputList))))

(defn get-doc-string
  "A human-readable documentation for this node. Markdown is allowed.
  string doc_string = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getDocString))))

(defn get-attribute
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`

  returns: `onnx.OnnxProto3$AttributeProto`"
  (^onnx.OnnxProto3$AttributeProto [^OnnxProto3$NodeProto$Builder this ^Integer index]
    (-> this (.getAttribute index))))

(defn get-name
  "An optional identifier for this node in a graph.
   This field MAY be absent in ths version of the IR.
  string name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-output-bytes
  "namespace Value
  repeated string output = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addOutputBytes value))))

(defn set-name-bytes
  "An optional identifier for this node in a graph.
   This field MAY be absent in ths version of the IR.
  string name = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn add-all-output
  "namespace Value
  repeated string output = 2;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOutput values))))

(defn get-output-list
  "namespace Value
  repeated string output = 2;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getOutputList))))

(defn get-input
  "namespace Value
  repeated string input = 1;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto$Builder this ^Integer index]
    (-> this (.getInput index))))

(defn remove-attribute
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^Integer index]
    (-> this (.removeAttribute index))))

(defn clear-input
  "namespace Value
  repeated string input = 1;

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.clearInput))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-attribute-or-builder-list
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `java.util.List<? extends onnx.OnnxProto3$AttributeProtoOrBuilder>`"
  ([^OnnxProto3$NodeProto$Builder this]
    (-> this (.getAttributeOrBuilderList))))

(defn build
  "returns: `onnx.OnnxProto3$NodeProto`"
  (^onnx.OnnxProto3$NodeProto [^OnnxProto3$NodeProto$Builder this]
    (-> this (.build))))

(defn set-attribute
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`
  value - `onnx.OnnxProto3$AttributeProto`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^Integer index ^onnx.OnnxProto3$AttributeProto value]
    (-> this (.setAttribute index value))))

(defn get-output-count
  "namespace Value
  repeated string output = 2;

  returns: `int`"
  (^Integer [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getOutputCount))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$NodeProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-op-type
  "The symbolic identifier of the Operator to execute.
  string op_type = 4;

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.clearOpType))))

(defn add-output
  "namespace Value
  repeated string output = 2;

  value - `java.lang.String`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^java.lang.String value]
    (-> this (.addOutput value))))

(defn get-output-bytes
  "namespace Value
  repeated string output = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$NodeProto$Builder this ^Integer index]
    (-> this (.getOutputBytes index))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-domain
  "The domain of the OperatorSet that specifies the operator named by op_type.
  string domain = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getDomain))))

(defn add-input
  "namespace Value
  repeated string input = 1;

  value - `java.lang.String`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^java.lang.String value]
    (-> this (.addInput value))))

(defn get-attribute-list
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  returns: `java.util.List<onnx.OnnxProto3$AttributeProto>`"
  (^java.util.List [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getAttributeList))))

(defn clone
  "returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxProto3$NodeProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn add-attribute-builder
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`

  returns: `onnx.OnnxProto3$AttributeProto$Builder`"
  (^onnx.OnnxProto3$AttributeProto$Builder [^OnnxProto3$NodeProto$Builder this ^Integer index]
    (-> this (.addAttributeBuilder index)))
  (^onnx.OnnxProto3$AttributeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.addAttributeBuilder))))

(defn add-attribute
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`
  value - `onnx.OnnxProto3$AttributeProto`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^Integer index ^onnx.OnnxProto3$AttributeProto value]
    (-> this (.addAttribute index value)))
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^onnx.OnnxProto3$AttributeProto value]
    (-> this (.addAttribute value))))

(defn add-input-bytes
  "namespace Value
  repeated string input = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addInputBytes value))))

(defn get-attribute-builder
  "Additional named attributes.
   NOTE: Simply using ValueProto.NameValuePairProto is the most general
         solution.  I kept AttributeProto to minimize churn on CI results.
  repeated .onnx.AttributeProto attribute = 5;

  index - `int`

  returns: `onnx.OnnxProto3$AttributeProto$Builder`"
  (^onnx.OnnxProto3$AttributeProto$Builder [^OnnxProto3$NodeProto$Builder this ^Integer index]
    (-> this (.getAttributeBuilder index))))

(defn set-domain
  "The domain of the OperatorSet that specifies the operator named by op_type.
  string domain = 7;

  value - `java.lang.String`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^java.lang.String value]
    (-> this (.setDomain value))))

(defn get-output
  "namespace Value
  repeated string output = 2;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$NodeProto$Builder this ^Integer index]
    (-> this (.getOutput index))))

(defn clear
  "returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-domain-bytes
  "The domain of the OperatorSet that specifies the operator named by op_type.
  string domain = 7;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$NodeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDomainBytes value))))

