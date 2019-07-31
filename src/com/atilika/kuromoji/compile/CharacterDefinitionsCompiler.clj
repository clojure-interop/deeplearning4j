(ns com.atilika.kuromoji.compile.CharacterDefinitionsCompiler
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.compile CharacterDefinitionsCompiler]))

(defn ->character-definitions-compiler
  "Constructor.

  output - `java.io.OutputStream`"
  (^CharacterDefinitionsCompiler [^java.io.OutputStream output]
    (new CharacterDefinitionsCompiler output)))

(defn read-character-definition
  "stream - `java.io.InputStream`
  encoding - `java.lang.String`

  throws: java.io.IOException"
  ([^CharacterDefinitionsCompiler this ^java.io.InputStream stream ^java.lang.String encoding]
    (-> this (.readCharacterDefinition stream encoding))))

(defn make-character-category-map
  "returns: `java.util.Map<java.lang.String,java.lang.Integer>`"
  (^java.util.Map [^CharacterDefinitionsCompiler this]
    (-> this (.makeCharacterCategoryMap))))

(defn get-category-definitions
  "returns: `java.util.Map<java.lang.String,int[]>`"
  ([^CharacterDefinitionsCompiler this]
    (-> this (.getCategoryDefinitions))))

(defn get-codepoint-categories
  "returns: `java.util.List<java.util.Set<java.lang.String>>`"
  (^java.util.List [^CharacterDefinitionsCompiler this]
    (-> this (.getCodepointCategories))))

(defn compile
  "throws: java.io.IOException"
  ([^CharacterDefinitionsCompiler this]
    (-> this (.compile))))

