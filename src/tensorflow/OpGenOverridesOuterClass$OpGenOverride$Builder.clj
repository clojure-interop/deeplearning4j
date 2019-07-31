(ns tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder
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
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverride$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpGenOverridesOuterClass$OpGenOverride$Builder/getDescriptor )))

(defn clear-name
  "Name of the op to apply overrides to.
  string name = 1;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clearName))))

(defn get-input-rename-or-builder-list
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getInputRenameOrBuilderList))))

(defn set-hide
  "Hide this op by putting it into an internal namespace (or whatever
   is appropriate in the target language).
  bool hide = 3;

  value - `boolean`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Boolean value]
    (-> this (.setHide value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-alias-bytes
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getAliasBytes index))))

(defn remove-output-rename
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.removeOutputRename index))))

(defn get-attr-default-list
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAttrDefaultList))))

(defn build-partial
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.buildPartial))))

(defn remove-attr-default
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.removeAttrDefault index))))

(defn get-output-rename-or-builder
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getOutputRenameOrBuilder index))))

(defn add-output-rename
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename value]
    (-> this (.addOutputRename index value)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename value]
    (-> this (.addOutputRename value))))

(defn get-attr-default-or-builder-list
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAttrDefaultOrBuilderList))))

(defn get-alias-count
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAliasCount))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.isInitialized))))

(defn clear-attr-default
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clearAttrDefault))))

(defn get-input-rename-or-builder
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getInputRenameOrBuilder index))))

(defn get-attr-default-builder-list
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAttrDefaultBuilderList))))

(defn add-all-input-rename
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  values - `java.lang.Iterable`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInputRename values))))

(defn get-attr-rename-count
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAttrRenameCount))))

(defn set-input-rename
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename value]
    (-> this (.setInputRename index value))))

(defn get-default-instance-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-output-rename
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getOutputRename index))))

(defn add-alias
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  value - `java.lang.String`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^java.lang.String value]
    (-> this (.addAlias value))))

(defn add-all-attr-default
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  values - `java.lang.Iterable`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^java.lang.Iterable values]
    (-> this (.addAllAttrDefault values))))

(defn get-name-bytes
  "Name of the op to apply overrides to.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getNameBytes))))

(defn add-all-alias
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  values - `java.lang.Iterable`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^java.lang.Iterable values]
    (-> this (.addAllAlias values))))

(defn clear-rename-to
  "Use a different name in the API than the op's name. Note that
   the op's name in `backticks` will also be replaced in the docs.
  string rename_to = 4;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clearRenameTo))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn add-alias-bytes
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addAliasBytes value))))

(defn set-skip
  "Do not include this op in the generated API.
   If `skip` is true, all other overrides are ignored for this op.
  bool skip = 2;

  value - `boolean`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Boolean value]
    (-> this (.setSkip value))))

(defn clear-attr-rename
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clearAttrRename))))

(defn get-attr-default
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getAttrDefault index))))

(defn set-name
  "Name of the op to apply overrides to.
  string name = 1;

  value - `java.lang.String`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-alias
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getAlias index))))

(defn get-skip?
  "Do not include this op in the generated API.
   If `skip` is true, all other overrides are ignored for this op.
  bool skip = 2;

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getSkip))))

(defn get-attr-rename-list
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAttrRenameList))))

(defn get-attr-rename-or-builder
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getAttrRenameOrBuilder index))))

(defn get-attr-default-builder
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getAttrDefaultBuilder index))))

(defn set-attr-rename
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename value]
    (-> this (.setAttrRename index value))))

(defn set-rename-to-bytes
  "Use a different name in the API than the op's name. Note that
   the op's name in `backticks` will also be replaced in the docs.
  string rename_to = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setRenameToBytes value))))

(defn clear-alias
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clearAlias))))

(defn get-rename-to-bytes
  "Use a different name in the API than the op's name. Note that
   the op's name in `backticks` will also be replaced in the docs.
  string rename_to = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getRenameToBytes))))

(defn get-alias-list
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAliasList))))

(defn get-input-rename-builder
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getInputRenameBuilder index))))

(defn get-input-rename-builder-list
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getInputRenameBuilderList))))

(defn get-name
  "Name of the op to apply overrides to.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-hide?
  "Hide this op by putting it into an internal namespace (or whatever
   is appropriate in the target language).
  bool hide = 3;

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getHide))))

(defn set-name-bytes
  "Name of the op to apply overrides to.
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn remove-attr-rename
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.removeAttrRename index))))

(defn get-attr-rename-builder-list
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAttrRenameBuilderList))))

(defn add-output-rename-builder
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.addOutputRenameBuilder index)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.addOutputRenameBuilder))))

(defn add-all-output-rename
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  values - `java.lang.Iterable`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOutputRename values))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn clear-input-rename
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clearInputRename))))

(defn build
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.build))))

(defn remove-input-rename
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.removeInputRename index))))

(defn get-attr-default-count
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAttrDefaultCount))))

(defn clear-output-rename
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clearOutputRename))))

(defn add-input-rename-builder
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.addInputRenameBuilder index)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.addInputRenameBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`

  throws: java.io.IOException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-attr-rename-or-builder-list
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getAttrRenameOrBuilderList))))

(defn clear-hide
  "Hide this op by putting it into an internal namespace (or whatever
   is appropriate in the target language).
  bool hide = 3;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clearHide))))

(defn set-output-rename
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename value]
    (-> this (.setOutputRename index value))))

(defn set-attr-default
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault value]
    (-> this (.setAttrDefault index value))))

(defn get-input-rename
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getInputRename index))))

(defn add-all-attr-rename
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  values - `java.lang.Iterable`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^java.lang.Iterable values]
    (-> this (.addAllAttrRename values))))

(defn add-input-rename
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename value]
    (-> this (.addInputRename index value)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename value]
    (-> this (.addInputRename value))))

(defn add-attr-rename
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename value]
    (-> this (.addAttrRename index value)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename value]
    (-> this (.addAttrRename value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-attr-default-or-builder
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getAttrDefaultOrBuilder index))))

(defn clone
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-output-rename-builder-list
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getOutputRenameBuilderList))))

(defn get-input-rename-count
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getInputRenameCount))))

(defn clear
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clear))))

(defn get-input-rename-list
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getInputRenameList))))

(defn add-attr-rename-builder
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.addAttrRenameBuilder index)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.addAttrRenameBuilder))))

(defn set-alias
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  index - `int`
  value - `java.lang.String`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index ^java.lang.String value]
    (-> this (.setAlias index value))))

(defn get-attr-rename-builder
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getAttrRenameBuilder index))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-output-rename-builder
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getOutputRenameBuilder index))))

(defn get-attr-rename
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.getAttrRename index))))

(defn add-attr-default
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault value]
    (-> this (.addAttrDefault index value)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault value]
    (-> this (.addAttrDefault value))))

(defn clear-skip
  "Do not include this op in the generated API.
   If `skip` is true, all other overrides are ignored for this op.
  bool skip = 2;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.clearSkip))))

(defn add-attr-default-builder
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^Integer index]
    (-> this (.addAttrDefaultBuilder index)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.addAttrDefaultBuilder))))

(defn get-output-rename-count
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getOutputRenameCount))))

(defn get-output-rename-or-builder-list
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getOutputRenameOrBuilderList))))

(defn get-output-rename-list
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getOutputRenameList))))

(defn set-rename-to
  "Use a different name in the API than the op's name. Note that
   the op's name in `backticks` will also be replaced in the docs.
  string rename_to = 4;

  value - `java.lang.String`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverride$Builder this ^java.lang.String value]
    (-> this (.setRenameTo value))))

(defn get-rename-to
  "Use a different name in the API than the op's name. Note that
   the op's name in `backticks` will also be replaced in the docs.
  string rename_to = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$Builder this]
    (-> this (.getRenameTo))))

