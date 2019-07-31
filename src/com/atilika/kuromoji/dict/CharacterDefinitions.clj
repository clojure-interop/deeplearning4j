(ns com.atilika.kuromoji.dict.CharacterDefinitions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.dict CharacterDefinitions]))

(defn ->character-definitions
  "Constructor.

  category-definitions - `int[][]`
  codepoint-mappings - `int[][]`
  category-symbols - `java.lang.String[]`"
  (^CharacterDefinitions [category-definitions codepoint-mappings category-symbols]
    (new CharacterDefinitions category-definitions codepoint-mappings category-symbols)))

(def *-character-definitions-filename
  "Static Constant.

  type: java.lang.String"
  CharacterDefinitions/CHARACTER_DEFINITIONS_FILENAME)

(def *-invoke
  "Static Constant.

  type: int"
  CharacterDefinitions/INVOKE)

(def *-group
  "Static Constant.

  type: int"
  CharacterDefinitions/GROUP)

(defn *new-instance
  "resolver - `com.atilika.kuromoji.util.ResourceResolver`

  returns: `com.atilika.kuromoji.dict.CharacterDefinitions`

  throws: java.io.IOException"
  (^com.atilika.kuromoji.dict.CharacterDefinitions [^com.atilika.kuromoji.util.ResourceResolver resolver]
    (CharacterDefinitions/newInstance resolver)))

(defn lookup-categories
  "c - `char`

  returns: `int[]`"
  ([^CharacterDefinitions this ^Character c]
    (-> this (.lookupCategories c))))

(defn lookup-definition
  "category - `int`

  returns: `int[]`"
  ([^CharacterDefinitions this ^Integer category]
    (-> this (.lookupDefinition category))))

(defn set-categories
  "c - `char`
  category-names - `java.lang.String[]`"
  ([^CharacterDefinitions this ^Character c category-names]
    (-> this (.setCategories c category-names))))

