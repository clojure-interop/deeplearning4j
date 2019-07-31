(ns com.atilika.kuromoji.compile.TokenInfoDictionaryCompilerBase
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile TokenInfoDictionaryCompilerBase]))

(defn ->token-info-dictionary-compiler-base
  "Constructor.

  encoding - `java.lang.String`"
  (^TokenInfoDictionaryCompilerBase [^java.lang.String encoding]
    (new TokenInfoDictionaryCompilerBase encoding)))

(defn get-csv-files
  "dir - `java.io.File`

  returns: `java.util.List<java.io.File>`"
  (^java.util.List [^TokenInfoDictionaryCompilerBase this ^java.io.File dir]
    (-> this (.getCsvFiles dir))))

(defn read-token-info
  "input - `java.io.InputStream`

  throws: java.io.IOException"
  ([^TokenInfoDictionaryCompilerBase this ^java.io.InputStream input]
    (-> this (.readTokenInfo input))))

(defn get-surfaces
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TokenInfoDictionaryCompilerBase this]
    (-> this (.getSurfaces))))

(defn set-dictionary-entries
  "Deprecated.

  dictionary-entries - `java.util.List`"
  ([^TokenInfoDictionaryCompilerBase this ^java.util.List dictionary-entries]
    (-> this (.setDictionaryEntries dictionary-entries))))

(defn get-dictionary-entries
  "Deprecated.

  returns: `java.util.List<com.atilika.kuromoji.dict.GenericDictionaryEntry>`"
  (^java.util.List [^TokenInfoDictionaryCompilerBase this]
    (-> this (.getDictionaryEntries))))

(defn get-word-id-map
  "Deprecated.

  returns: `com.atilika.kuromoji.buffer.WordIdMap`

  throws: java.io.IOException"
  (^com.atilika.kuromoji.buffer.WordIdMap [^TokenInfoDictionaryCompilerBase this]
    (-> this (.getWordIdMap))))

(defn get-buffer-entries
  "Deprecated.

  returns: `java.util.List<com.atilika.kuromoji.buffer.BufferEntry>`"
  (^java.util.List [^TokenInfoDictionaryCompilerBase this]
    (-> this (.getBufferEntries))))

(defn combined-sequential-file-input-stream
  "dir - `java.io.File`

  returns: `java.io.InputStream`

  throws: java.io.FileNotFoundException"
  (^java.io.InputStream [^TokenInfoDictionaryCompilerBase this ^java.io.File dir]
    (-> this (.combinedSequentialFileInputStream dir))))

(defn add-mapping
  "source-id - `int`
  word-id - `int`"
  ([^TokenInfoDictionaryCompilerBase this ^Integer source-id ^Integer word-id]
    (-> this (.addMapping source-id word-id))))

(defn compile
  "throws: java.io.IOException"
  ([^TokenInfoDictionaryCompilerBase this]
    (-> this (.compile))))

(defn analyze-token-info
  "input - `java.io.InputStream`

  throws: java.io.IOException"
  ([^TokenInfoDictionaryCompilerBase this ^java.io.InputStream input]
    (-> this (.analyzeTokenInfo input))))

(defn write
  "directory-name - `java.lang.String`

  throws: java.io.IOException"
  ([^TokenInfoDictionaryCompilerBase this ^java.lang.String directory-name]
    (-> this (.write directory-name))))

