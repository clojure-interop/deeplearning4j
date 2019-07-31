(ns com.atilika.kuromoji.compile.UnknownDictionaryCompiler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile UnknownDictionaryCompiler]))

(defn ->unknown-dictionary-compiler
  "Constructor.

  category-map - `java.util.Map`
  output - `java.io.OutputStream`"
  (^UnknownDictionaryCompiler [^java.util.Map category-map ^java.io.OutputStream output]
    (new UnknownDictionaryCompiler category-map output)))

(defn read-unknown-definition
  "input - `java.io.InputStream`
  encoding - `java.lang.String`

  throws: java.io.IOException"
  ([^UnknownDictionaryCompiler this ^java.io.InputStream input ^java.lang.String encoding]
    (-> this (.readUnknownDefinition input encoding))))

(defn make-costs
  "returns: `int[][]`"
  ([^UnknownDictionaryCompiler this]
    (-> this (.makeCosts))))

(defn make-features
  "returns: `java.lang.String[][]`"
  ([^UnknownDictionaryCompiler this]
    (-> this (.makeFeatures))))

(defn make-category-references
  "returns: `int[][]`"
  ([^UnknownDictionaryCompiler this]
    (-> this (.makeCategoryReferences))))

(defn print-features
  "features - `java.lang.String[][]`"
  ([^UnknownDictionaryCompiler this features]
    (-> this (.printFeatures features))))

(defn get-entry-indices
  "surface - `java.lang.String`

  returns: `int[]`"
  ([^UnknownDictionaryCompiler this ^java.lang.String surface]
    (-> this (.getEntryIndices surface))))

(defn get-dictionary-entries
  "returns: `java.util.List<com.atilika.kuromoji.dict.GenericDictionaryEntry>`"
  (^java.util.List [^UnknownDictionaryCompiler this]
    (-> this (.getDictionaryEntries))))

(defn compile
  "throws: java.io.IOException"
  ([^UnknownDictionaryCompiler this]
    (-> this (.compile))))

