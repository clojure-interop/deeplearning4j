(ns tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverrideOrBuilder]))

(defn get-input-rename-or-builder-list
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getInputRenameOrBuilderList))))

(defn get-alias-bytes
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getAliasBytes index))))

(defn get-attr-default-list
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getAttrDefaultList))))

(defn get-output-rename-or-builder
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getOutputRenameOrBuilder index))))

(defn get-attr-default-or-builder-list
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getAttrDefaultOrBuilderList))))

(defn get-alias-count
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getAliasCount))))

(defn get-input-rename-or-builder
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getInputRenameOrBuilder index))))

(defn get-attr-rename-count
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getAttrRenameCount))))

(defn get-output-rename
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getOutputRename index))))

(defn get-name-bytes
  "Name of the op to apply overrides to.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-attr-default
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getAttrDefault index))))

(defn get-alias
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getAlias index))))

(defn get-skip?
  "Do not include this op in the generated API.
   If `skip` is true, all other overrides are ignored for this op.
  bool skip = 2;

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getSkip))))

(defn get-attr-rename-list
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getAttrRenameList))))

(defn get-attr-rename-or-builder
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getAttrRenameOrBuilder index))))

(defn get-rename-to-bytes
  "Use a different name in the API than the op's name. Note that
   the op's name in `backticks` will also be replaced in the docs.
  string rename_to = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getRenameToBytes))))

(defn get-alias-list
  "Create *additional* API endpoints with different names (contrast
   with rename_to, which affects the original name).
  repeated string alias = 5;

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getAliasList))))

(defn get-name
  "Name of the op to apply overrides to.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getName))))

(defn get-hide?
  "Hide this op by putting it into an internal namespace (or whatever
   is appropriate in the target language).
  bool hide = 3;

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getHide))))

(defn get-attr-default-count
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getAttrDefaultCount))))

(defn get-attr-rename-or-builder-list
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getAttrRenameOrBuilderList))))

(defn get-input-rename
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getInputRename index))))

(defn get-attr-default-or-builder
  "repeated .tensorflow.OpGenOverride.AttrDefault attr_default = 6;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefaultOrBuilder [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getAttrDefaultOrBuilder index))))

(defn get-input-rename-count
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getInputRenameCount))))

(defn get-input-rename-list
  "repeated .tensorflow.OpGenOverride.Rename input_rename = 8;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getInputRenameList))))

(defn get-attr-rename
  "repeated .tensorflow.OpGenOverride.Rename attr_rename = 7;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this ^Integer index]
    (-> this (.getAttrRename index))))

(defn get-output-rename-count
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getOutputRenameCount))))

(defn get-output-rename-or-builder-list
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverride$RenameOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getOutputRenameOrBuilderList))))

(defn get-output-rename-list
  "repeated .tensorflow.OpGenOverride.Rename output_rename = 9;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getOutputRenameList))))

(defn get-rename-to
  "Use a different name in the API than the op's name. Note that
   the op's name in `backticks` will also be replaced in the docs.
  string rename_to = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverrideOrBuilder this]
    (-> this (.getRenameTo))))

