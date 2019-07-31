(ns tensorflow.OpGenOverridesOuterClass$OpGenOverride
  " Used to override the default API & behavior in the generated code
  for client languages, from what you would get from the OpDef alone.
  This is so we can evolve the API while remaining backwards
  compatible when interpretting old graphs.  Overrides go in an
  \"op_gen_overrides.pbtxt\" file with a text-format OpGenOverrides
  message.  Right now these only apply to the C++ API.
  TODO(josh11b): In the future there will be a common set of overrides
  and per-client-language overrides.
  WARNING: Be *very* careful using these features -- these overrides
  can change the semantics of existing code.  These changes may need
  to wait until a major release of TensorFlow to avoid breaking our
  compatibility promises.
 Protobuf type tensorflow.OpGenOverride"
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverride]))

(def *-name-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride/NAME_FIELD_NUMBER)

(def *-skip-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride/SKIP_FIELD_NUMBER)

(def *-hide-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride/HIDE_FIELD_NUMBER)

(def *-rename-to-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride/RENAME_TO_FIELD_NUMBER)

(def *-alias-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride/ALIAS_FIELD_NUMBER)

(def *-attr-default-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride/ATTR_DEFAULT_FIELD_NUMBER)

(def *-attr-rename-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride/ATTR_RENAME_FIELD_NUMBER)

(def *-input-rename-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride/INPUT_RENAME_FIELD_NUMBER)

(def *-output-rename-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride/OUTPUT_RENAME_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpGenOverridesOuterClass$OpGenOverride/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpGenOverridesOuterClass$OpGenOverride/parseFrom data extension-registry))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^java.nio.ByteBuffer data]
    (OpGenOverridesOuterClass$OpGenOverride/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`

  throws: java.io.IOException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpGenOverridesOuterClass$OpGenOverride/parseDelimitedFrom input extension-registry))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^java.io.InputStream input]
    (OpGenOverridesOuterClass$OpGenOverride/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `tensorflow.OpGenOverridesOuterClass$OpGenOverride`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^tensorflow.OpGenOverridesOuterClass$OpGenOverride prototype]
    (OpGenOverridesOuterClass$OpGenOverride/newBuilder prototype))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder []
    (OpGenOverridesOuterClass$OpGenOverride/newBuilder )))

(defn *get-default-instance
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride []
    (OpGenOverridesOuterClass$OpGenOverride/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<tensorflow.OpGenOverridesOuterClass$OpGenOverride>`"
  (^com.github.os72.protobuf351.Parser []
    (OpGenOverridesOuterClass$OpGenOverride/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getUnknownFields))))

(defn get-input-rename-or-builder-list
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getInputRenameOrBuilderList))))

(defn get-alias-bytes
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getAliasBytes index))))

(defn get-attr-default-list
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getAttrDefaultList))))

(defn get-output-rename-or-builder
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getOutputRenameOrBuilder index))))

(defn get-attr-default-or-builder-list
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getAttrDefaultOrBuilderList))))

(defn get-alias-count
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getAliasCount))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.isInitialized))))

(defn get-input-rename-or-builder
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getInputRenameOrBuilder index))))

(defn get-attr-rename-count
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getAttrRenameCount))))

(defn get-default-instance-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getDefaultInstanceForType))))

(defn get-output-rename
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getOutputRename index))))

(defn get-name-bytes
  "Name of the op to apply overrides to.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getSerializedSize))))

(defn get-attr-default
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getAttrDefault index))))

(defn get-alias
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getAlias index))))

(defn get-skip?
  "Do not include this op in the generated API.
   If `skip` is true, all other overrides are ignored for this op.
  bool skip = 2;

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getSkip))))

(defn get-attr-rename-list
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getAttrRenameList))))

(defn get-attr-rename-or-builder
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getAttrRenameOrBuilder index))))

(defn get-rename-to-bytes
  "Use a different name in the API than the op's name. Note that
   the op's name in `backticks` will also be replaced in the docs.
  string rename_to = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getRenameToBytes))))

(defn get-alias-list
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getAliasList))))

(defn get-name
  "Name of the op to apply overrides to.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getName))))

(defn get-hide?
  "Hide this op by putting it into an internal namespace (or whatever
   is appropriate in the target language).
  bool hide = 3;

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getHide))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OpGenOverridesOuterClass$OpGenOverride this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-attr-default-count
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getAttrDefaultCount))))

(defn get-attr-rename-or-builder-list
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getAttrRenameOrBuilderList))))

(defn get-input-rename
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getInputRename index))))

(defn get-attr-default-or-builder
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getAttrDefaultOrBuilder index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.hashCode))))

(defn get-input-rename-count
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getInputRenameCount))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<tensorflow.OpGenOverridesOuterClass$OpGenOverride>`"
  (^com.github.os72.protobuf351.Parser [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getParserForType))))

(defn get-input-rename-list
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getInputRenameList))))

(defn get-attr-rename
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride this ^Integer index]
    (-> this (.getAttrRename index))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.toBuilder))))

(defn get-output-rename-count
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getOutputRenameCount))))

(defn get-output-rename-or-builder-list
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getOutputRenameOrBuilderList))))

(defn get-output-rename-list
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getOutputRenameList))))

(defn get-rename-to
  "Use a different name in the API than the op's name. Note that
   the op's name in `backticks` will also be replaced in the docs.
  string rename_to = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride this]
    (-> this (.getRenameTo))))

