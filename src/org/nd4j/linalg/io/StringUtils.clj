(ns org.nd4j.linalg.io.StringUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io StringUtils]))

(defn ->string-utils
  "Constructor."
  (^StringUtils []
    (new StringUtils )))

(defn *parse-locale-string
  "locale-string - `java.lang.String`

  returns: `java.util.Locale`"
  (^java.util.Locale [^java.lang.String locale-string]
    (StringUtils/parseLocaleString locale-string)))

(defn *trim-leading-whitespace
  "str - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/trimLeadingWhitespace str)))

(defn *has-length?
  "str - `java.lang.CharSequence`

  returns: `boolean`"
  (^Boolean [^java.lang.CharSequence str]
    (StringUtils/hasLength str)))

(defn *starts-with-ignore-case
  "str - `java.lang.String`
  prefix - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String str ^java.lang.String prefix]
    (StringUtils/startsWithIgnoreCase str prefix)))

(defn *trim-leading-character
  "str - `java.lang.String`
  leading-character - `char`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character leading-character]
    (StringUtils/trimLeadingCharacter str leading-character)))

(defn *comma-delimited-list-to-string-array
  "str - `java.lang.String`

  returns: `java.lang.String[]`"
  ([^java.lang.String str]
    (StringUtils/commaDelimitedListToStringArray str)))

(defn *collection-to-comma-delimited-string
  "coll - `java.util.Collection`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.Collection coll]
    (StringUtils/collectionToCommaDelimitedString coll)))

(defn *concatenate-string-arrays
  "array-1 - `java.lang.String[]`
  array-2 - `java.lang.String[]`

  returns: `java.lang.String[]`"
  ([array-1 array-2]
    (StringUtils/concatenateStringArrays array-1 array-2)))

(defn *remove-duplicate-strings
  "array - `java.lang.String[]`

  returns: `java.lang.String[]`"
  ([array]
    (StringUtils/removeDuplicateStrings array)))

(defn *delete
  "in-string - `java.lang.String`
  pattern - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String in-string ^java.lang.String pattern]
    (StringUtils/delete in-string pattern)))

(defn *delimited-list-to-string-array
  "str - `java.lang.String`
  delimiter - `java.lang.String`
  chars-to-delete - `java.lang.String`

  returns: `java.lang.String[]`"
  ([^java.lang.String str ^java.lang.String delimiter ^java.lang.String chars-to-delete]
    (StringUtils/delimitedListToStringArray str delimiter chars-to-delete))
  ([^java.lang.String str ^java.lang.String delimiter]
    (StringUtils/delimitedListToStringArray str delimiter)))

(defn *has-text?
  "str - `java.lang.CharSequence`

  returns: `boolean`"
  (^Boolean [^java.lang.CharSequence str]
    (StringUtils/hasText str)))

(defn *to-language-tag
  "locale - `java.util.Locale`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.Locale locale]
    (StringUtils/toLanguageTag locale)))

(defn *quote-if-string
  "obj - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^java.lang.Object obj]
    (StringUtils/quoteIfString obj)))

(defn *trim-trailing-character
  "str - `java.lang.String`
  trailing-character - `char`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character trailing-character]
    (StringUtils/trimTrailingCharacter str trailing-character)))

(defn *replace
  "in-string - `java.lang.String`
  old-pattern - `java.lang.String`
  new-pattern - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String in-string ^java.lang.String old-pattern ^java.lang.String new-pattern]
    (StringUtils/replace in-string old-pattern new-pattern)))

(defn *to-string-array
  "collection - `java.util.Collection`

  returns: `java.lang.String[]`"
  ([^java.util.Collection collection]
    (StringUtils/toStringArray collection)))

(defn *trim-all-whitespace
  "str - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/trimAllWhitespace str)))

(defn *get-filename
  "path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String path]
    (StringUtils/getFilename path)))

(defn *substring-match
  "str - `java.lang.CharSequence`
  index - `int`
  substring - `java.lang.CharSequence`

  returns: `boolean`"
  (^Boolean [^java.lang.CharSequence str ^Integer index ^java.lang.CharSequence substring]
    (StringUtils/substringMatch str index substring)))

(defn *apply-relative-path
  "path - `java.lang.String`
  relative-path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String path ^java.lang.String relative-path]
    (StringUtils/applyRelativePath path relative-path)))

(defn *capitalize
  "str - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/capitalize str)))

(defn *split
  "to-split - `java.lang.String`
  delimiter - `java.lang.String`

  returns: `java.lang.String[]`"
  ([^java.lang.String to-split ^java.lang.String delimiter]
    (StringUtils/split to-split delimiter)))

(defn *tokenize-to-string-array
  "str - `java.lang.String`
  delimiters - `java.lang.String`
  trim-tokens - `boolean`
  ignore-empty-tokens - `boolean`

  returns: `java.lang.String[]`"
  ([^java.lang.String str ^java.lang.String delimiters ^Boolean trim-tokens ^Boolean ignore-empty-tokens]
    (StringUtils/tokenizeToStringArray str delimiters trim-tokens ignore-empty-tokens))
  ([^java.lang.String str ^java.lang.String delimiters]
    (StringUtils/tokenizeToStringArray str delimiters)))

(defn *get-filename-extension
  "path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String path]
    (StringUtils/getFilenameExtension path)))

(defn *trim-whitespace
  "str - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/trimWhitespace str)))

(defn *path-equals
  "path-1 - `java.lang.String`
  path-2 - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String path-1 ^java.lang.String path-2]
    (StringUtils/pathEquals path-1 path-2)))

(defn *clean-path
  "path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String path]
    (StringUtils/cleanPath path)))

(defn *uncapitalize
  "str - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/uncapitalize str)))

(defn *add-string-to-array
  "array - `java.lang.String[]`
  str - `java.lang.String`

  returns: `java.lang.String[]`"
  ([array ^java.lang.String str]
    (StringUtils/addStringToArray array str)))

(defn *comma-delimited-list-to-set
  "str - `java.lang.String`

  returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^java.lang.String str]
    (StringUtils/commaDelimitedListToSet str)))

(defn *split-array-elements-into-properties
  "array - `java.lang.String[]`
  delimiter - `java.lang.String`
  chars-to-delete - `java.lang.String`

  returns: `java.util.Properties`"
  (^java.util.Properties [array ^java.lang.String delimiter ^java.lang.String chars-to-delete]
    (StringUtils/splitArrayElementsIntoProperties array delimiter chars-to-delete))
  (^java.util.Properties [array ^java.lang.String delimiter]
    (StringUtils/splitArrayElementsIntoProperties array delimiter)))

(defn *quote
  "str - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/quote str)))

(defn *contains-whitespace
  "str - `java.lang.CharSequence`

  returns: `boolean`"
  (^Boolean [^java.lang.CharSequence str]
    (StringUtils/containsWhitespace str)))

(defn *collection-to-delimited-string
  "coll - `java.util.Collection`
  delim - `java.lang.String`
  prefix - `java.lang.String`
  suffix - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.Collection coll ^java.lang.String delim ^java.lang.String prefix ^java.lang.String suffix]
    (StringUtils/collectionToDelimitedString coll delim prefix suffix))
  (^java.lang.String [^java.util.Collection coll ^java.lang.String delim]
    (StringUtils/collectionToDelimitedString coll delim)))

(defn *empty?
  "str - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^java.lang.Object str]
    (StringUtils/isEmpty str)))

(defn *trim-array-elements
  "array - `java.lang.String[]`

  returns: `java.lang.String[]`"
  ([array]
    (StringUtils/trimArrayElements array)))

(defn *strip-filename-extension
  "path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String path]
    (StringUtils/stripFilenameExtension path)))

(defn *trim-trailing-whitespace
  "str - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/trimTrailingWhitespace str)))

(defn *sort-string-array
  "array - `java.lang.String[]`

  returns: `java.lang.String[]`"
  ([array]
    (StringUtils/sortStringArray array)))

(defn *unqualify
  "qualified-name - `java.lang.String`
  separator - `char`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String qualified-name ^Character separator]
    (StringUtils/unqualify qualified-name separator))
  (^java.lang.String [^java.lang.String qualified-name]
    (StringUtils/unqualify qualified-name)))

(defn *array-to-comma-delimited-string
  "arr - `java.lang.Object[]`

  returns: `java.lang.String`"
  (^java.lang.String [arr]
    (StringUtils/arrayToCommaDelimitedString arr)))

(defn *ends-with-ignore-case
  "str - `java.lang.String`
  suffix - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String str ^java.lang.String suffix]
    (StringUtils/endsWithIgnoreCase str suffix)))

(defn *merge-string-arrays
  "array-1 - `java.lang.String[]`
  array-2 - `java.lang.String[]`

  returns: `java.lang.String[]`"
  ([array-1 array-2]
    (StringUtils/mergeStringArrays array-1 array-2)))

(defn *count-occurrences-of
  "str - `java.lang.String`
  sub - `java.lang.String`

  returns: `int`"
  (^Integer [^java.lang.String str ^java.lang.String sub]
    (StringUtils/countOccurrencesOf str sub)))

(defn *array-to-delimited-string
  "arr - `java.lang.Object[]`
  delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [arr ^java.lang.String delim]
    (StringUtils/arrayToDelimitedString arr delim)))

(defn *delete-any
  "in-string - `java.lang.String`
  chars-to-delete - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String in-string ^java.lang.String chars-to-delete]
    (StringUtils/deleteAny in-string chars-to-delete)))

