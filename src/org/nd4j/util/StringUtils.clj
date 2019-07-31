(ns org.nd4j.util.StringUtils
  "General string utils - adapted from
 Apache Hadoop StringUtils, with modifications"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.util StringUtils]))

(defn ->string-utils
  "Constructor."
  (^StringUtils []
    (new StringUtils )))

(def *-empty-string-array
  "Static Constant.

  type: java.lang.String[]"
  StringUtils/emptyStringArray)

(def *-comma
  "Static Constant.

  type: char"
  StringUtils/COMMA)

(def *-escape-char
  "Static Constant.

  type: char"
  StringUtils/ESCAPE_CHAR)

(defn *byte-to-hex-string
  "Given an array of bytes it will convert the bytes to a hex string
  representation of the bytes

  bytes - `byte[]`
  start - start index, inclusively - `int`
  end - end index, exclusively - `int`

  returns: hex string representation of the byte array - `java.lang.String`"
  (^java.lang.String [bytes ^Integer start ^Integer end]
    (StringUtils/byteToHexString bytes start end))
  (^java.lang.String [bytes]
    (StringUtils/byteToHexString bytes)))

(defn *get-stack-trace
  "Get stack trace for a given thread.

  t - `java.lang.Thread`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.Thread t]
    (StringUtils/getStackTrace t)))

(defn *format-time
  "Given the time in long milliseconds, returns a
  String in the format Xhrs, Ymins, Z sec.

  time-diff - The time difference to format - `long`

  returns: `java.lang.String`"
  (^java.lang.String [^Long time-diff]
    (StringUtils/formatTime time-diff)))

(defn *to-lower-case
  "Converts all of the characters in this String to lower case with
  Locale.ENGLISH.

  str - string to be converted - `java.lang.String`

  returns: the str, converted to lowercase. - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/toLowerCase str)))

(defn *hex-string-to-byte
  "Given a hexstring this will return the byte array corresponding to the
  string

  hex - the hex String array - `java.lang.String`

  returns: a byte array that is a hex string representation of the given
  string. The size of the byte array is therefore hex.length/2 - `byte[]`"
  ([^java.lang.String hex]
    (StringUtils/hexStringToByte hex)))

(defn *string-to-uri
  "str - The string array to be parsed into an URI array. - `java.lang.String[]`

  returns: null if str is null, else the URI array
  equivalent to str. - `java.net.URI[]`

  throws: java.lang.IllegalArgumentException - If any string in str violates RFC 2396."
  ([str]
    (StringUtils/stringToURI str)))

(defn *get-trimmed-string-collection
  "Splits a comma separated value String, trimming leading and
  trailing whitespace on each value. Duplicate and empty values are removed.

  str - a comma separated with values, may be null - `java.lang.String`

  returns: a Collection of String values, empty
  Collection if null String input - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^java.lang.String str]
    (StringUtils/getTrimmedStringCollection str)))

(defn *replace-tokens
  "Matches a template string against a pattern, replaces matched tokens with
  the supplied replacements, and returns the result. The regular expression
  must use a capturing group. The value of the first capturing group is used
  to look up the replacement. If no replacement is found for the token, then
  it is replaced with the empty string.
  For example, assume template is \"%foo%_%bar%_%baz%\", pattern is \"%(.*?)%\",
  and replacements contains 2 entries, mapping \"foo\" to \"zoo\" and \"baz\" to
  \"zaz\". The result returned would be \"zoo__zaz\".

  template - String template to receive replacements - `java.lang.String`
  pattern - Pattern to match for identifying tokens, must use a capturinggroup - `java.util.regex.Pattern`
  replacements - Map mapping tokens identified by thecapturing group to their replacement values - `java.util.Map`

  returns: String template with replacements - `java.lang.String`"
  (^java.lang.String [^java.lang.String template ^java.util.regex.Pattern pattern ^java.util.Map replacements]
    (StringUtils/replaceTokens template pattern replacements)))

(defn *uri-to-string
  "uris - `java.net.URI[]`

  returns: `java.lang.String`"
  (^java.lang.String [uris]
    (StringUtils/uriToString uris)))

(defn *get-trimmed-strings
  "Splits a comma or newline separated value String, trimming
  leading and trailing whitespace on each value.

  str - a comma or newline separated String with values,may be null - `java.lang.String`

  returns: an array of String values, empty array if null String
  input - `java.lang.String[]`"
  ([^java.lang.String str]
    (StringUtils/getTrimmedStrings str)))

(defn *string-to-time-unit
  "str - `java.lang.String`

  returns: `java.util.concurrent.TimeUnit`"
  (^java.util.concurrent.TimeUnit [^java.lang.String str]
    (StringUtils/stringToTimeUnit str)))

(defn *limit-decimal-to-2
  "Deprecated. use StringUtils.format(\"%.2f\", d).

  d - `double`

  returns: `java.lang.String`"
  (^java.lang.String [^Double d]
    (StringUtils/limitDecimalTo2 d)))

(defn *get-formatted-time-with-diff
  "Formats time in ms and appends difference (finishTime - startTime)
  as returned by formatTimeDiff().
  If finish time is 0, empty string is returned, if start time is 0
  then difference is not appended to return value.

  formatted-finish-time - formattedFinishTime to use - `java.lang.String`
  finish-time - finish time - `long`
  start-time - start time - `long`

  returns: formatted value. - `java.lang.String`"
  (^java.lang.String [^java.lang.String formatted-finish-time ^Long finish-time ^Long start-time]
    (StringUtils/getFormattedTimeWithDiff formatted-finish-time finish-time start-time)))

(defn *format-percent
  "Format a percentage for presentation to the user.

  fraction - the percentage as a fraction, e.g. 0.1 = 10% - `double`
  decimal-places - the number of decimal places - `int`

  returns: a string representation of the percentage - `java.lang.String`"
  (^java.lang.String [^Double fraction ^Integer decimal-places]
    (StringUtils/formatPercent fraction decimal-places)))

(defn *format-time-sortable
  "Given the time in long milliseconds, returns a String in the sortable
  format Xhrs, Ymins, Zsec. X, Y, and Z are always two-digit. If the time is
  more than 100 hours ,it is displayed as 99hrs, 59mins, 59sec.

  time-diff - The time difference to format - `long`

  returns: `java.lang.String`"
  (^java.lang.String [^Long time-diff]
    (StringUtils/formatTimeSortable time-diff)))

(defn *find-next
  "Finds the first occurrence of the separator character ignoring the escaped
  separators starting from the index. Note the substring between the index
  and the position of the separator is passed.

  str - the source string - `java.lang.String`
  separator - the character to find - `char`
  escape-char - character used to escape - `char`
  start - from where to search - `int`
  split - used to pass back the extracted string - `java.lang.StringBuilder`

  returns: `int`"
  (^Integer [^java.lang.String str ^Character separator ^Character escape-char ^Integer start ^java.lang.StringBuilder split]
    (StringUtils/findNext str separator escape-char start split)))

(defn *get-string-collection
  "Returns a collection of strings.

  str - String to parse - `java.lang.String`
  delim - delimiter to separate the values - `java.lang.String`

  returns: Collection of parsed elements. - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^java.lang.String str ^java.lang.String delim]
    (StringUtils/getStringCollection str delim))
  (^java.util.Collection [^java.lang.String str]
    (StringUtils/getStringCollection str)))

(defn *escape-html
  "Escapes HTML Special characters present in the string.

  string - `java.lang.String`

  returns: HTML Escaped String representation - `java.lang.String`"
  (^java.lang.String [^java.lang.String string]
    (StringUtils/escapeHTML string)))

(defn *split-on-char-with-quoting
  "This function splits the String s into multiple Strings using the
  splitChar. However, it provides an quoting facility: it is possible to
  quote strings with the quoteChar.
  If the quoteChar occurs within the quotedExpression, it must be prefaced
  by the escapeChar

  s - The String to split - `java.lang.String`
  split-char - `char`
  quote-char - `char`
  escape-char - `char`

  returns: An array of Strings that s is split into - `java.lang.String[]`"
  ([^java.lang.String s ^Character split-char ^Character quote-char ^Character escape-char]
    (StringUtils/splitOnCharWithQuoting s split-char quote-char escape-char)))

(defn *equals-ignore-case
  "Compare strings locale-freely by using String#equalsIgnoreCase.

  s-1 - Non-null string to be converted - `java.lang.String`
  s-2 - string to be converted - `java.lang.String`

  returns: the str, converted to uppercase. - `boolean`"
  (^Boolean [^java.lang.String s-1 ^java.lang.String s-2]
    (StringUtils/equalsIgnoreCase s-1 s-2)))

(defn *human-readable-int
  "Deprecated. use StringUtils.TraditionalBinaryPrefix.long2String(long, String, int).

  number - the number to format - `long`

  returns: a human readable form of the integer - `java.lang.String`"
  (^java.lang.String [^Long number]
    (StringUtils/humanReadableInt number)))

(defn *escape-string
  "Escape charToEscape in the string
  with the escape char escapeChar

  str - string - `java.lang.String`
  escape-char - escape char - `char`
  char-to-escape - the char to be escaped - `char`

  returns: an escaped string - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character escape-char ^Character char-to-escape]
    (StringUtils/escapeString str escape-char char-to-escape))
  (^java.lang.String [^java.lang.String str]
    (StringUtils/escapeString str)))

(defn *split
  "Split a string using the given separator

  str - a string that may have escaped separator - `java.lang.String`
  escape-char - a char that be used to escape the separator - `char`
  separator - a separator char - `char`

  returns: an array of strings - `java.lang.String[]`"
  ([^java.lang.String str ^Character escape-char ^Character separator]
    (StringUtils/split str escape-char separator))
  ([^java.lang.String str ^Character separator]
    (StringUtils/split str separator))
  ([^java.lang.String str]
    (StringUtils/split str)))

(defn *byte-desc
  "len - `long`

  returns: a byte description of the given long interger value. - `java.lang.String`"
  (^java.lang.String [^Long len]
    (StringUtils/byteDesc len)))

(defn *to-upper-case
  "Converts all of the characters in this String to upper case with
  Locale.ENGLISH.

  str - string to be converted - `java.lang.String`

  returns: the str, converted to uppercase. - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/toUpperCase str)))

(defn *get-strings
  "Returns an arraylist of strings.

  str - the string values - `java.lang.String`
  delim - delimiter to separate the values - `java.lang.String`

  returns: the arraylist of the separated string values - `java.lang.String[]`"
  ([^java.lang.String str ^java.lang.String delim]
    (StringUtils/getStrings str delim))
  ([^java.lang.String str]
    (StringUtils/getStrings str)))

(defn *alpha?
  "Checks if the String contains only unicode letters.
  null will return false.
  An empty String (length()=0) will return true.


   StringUtils.isAlpha(null)   = false
   StringUtils.isAlpha(\"\")     = true
   StringUtils.isAlpha(\"  \")   = false
   StringUtils.isAlpha(\"abc\")  = true
   StringUtils.isAlpha(\"ab2c\") = false
   StringUtils.isAlpha(\"ab-c\") = false

  str - the String to check, may be null - `java.lang.String`

  returns: true if only contains letters, and is non-null - `boolean`"
  (^Boolean [^java.lang.String str]
    (StringUtils/isAlpha str)))

(defn *format-time-diff
  "Given a finish and start time in long milliseconds, returns a
  String in the format Xhrs, Ymins, Z sec, for the time difference between two times.
  If finish time comes before start time then negative valeus of X, Y and Z wil return.

  finish-time - finish time - `long`
  start-time - start time - `long`

  returns: `java.lang.String`"
  (^java.lang.String [^Long finish-time ^Long start-time]
    (StringUtils/formatTimeDiff finish-time start-time)))

(defn *un-escape-string
  "Unescape charToEscape in the string
  with the escape char escapeChar

  str - string - `java.lang.String`
  escape-char - escape char - `char`
  char-to-escape - the escaped char - `char`

  returns: an unescaped string - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character escape-char ^Character char-to-escape]
    (StringUtils/unEscapeString str escape-char char-to-escape))
  (^java.lang.String [^java.lang.String str]
    (StringUtils/unEscapeString str)))

(defn *array-to-string
  "Given an array of strings, return a comma-separated list of its elements.

  strs - Array of strings - `java.lang.String[]`

  returns: Empty string if strs.length is 0, comma separated list of strings
  otherwise - `java.lang.String`"
  (^java.lang.String [strs]
    (StringUtils/arrayToString strs)))

(defn *join
  "Concatenates strings, using a separator.

  separator - Separator to join with. - `java.lang.CharSequence`
  strings - Strings to join. - `java.lang.Iterable`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.CharSequence separator ^java.lang.Iterable strings]
    (StringUtils/join separator strings))
  (^java.lang.String [^java.lang.Iterable strings]
    (StringUtils/join strings)))

(defn *time-unit-to-string
  "time - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `java.lang.String`"
  (^java.lang.String [^Long time ^java.util.concurrent.TimeUnit unit]
    (StringUtils/timeUnitToString time unit)))

(defn *simple-hostname
  "Given a full hostname, return the word upto the first dot.

  full-hostname - the full hostname - `java.lang.String`

  returns: the hostname to the first dot - `java.lang.String`"
  (^java.lang.String [^java.lang.String full-hostname]
    (StringUtils/simpleHostname full-hostname)))

(defn *stringify-exception
  "Make a string representation of the exception.

  e - The exception to stringify - `java.lang.Throwable`

  returns: A string with exception name and call stack. - `java.lang.String`"
  (^java.lang.String [^java.lang.Throwable e]
    (StringUtils/stringifyException e)))

(defn *format
  "The same as String.format(Locale.ENGLISH, format, objects).

  format - `java.lang.String`
  objects - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String format ^java.lang.Object objects]
    (StringUtils/format format objects)))

(defn *camelize
  "Convert SOME_STUFF to SomeStuff

  s - input string - `java.lang.String`

  returns: camelized string - `java.lang.String`"
  (^java.lang.String [^java.lang.String s]
    (StringUtils/camelize s)))

