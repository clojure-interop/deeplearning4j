(ns org.nd4j.tools.BTools
  "includes several base tools"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.tools BTools]))

(defn ->b-tools
  "Constructor."
  (^BTools []
    (new BTools )))

(defn *get-spaces
  "getSpaces
  public static String getSpaces( int SpacesCount )
  Returns asked count of spaces.
  If count of spaces is < 0 returns '?'.

  spaces-count - = spaces count - `int`

  returns: spaces - `java.lang.String`"
  (^java.lang.String [^Integer spaces-count]
    (BTools/getSpaces spaces-count)))

(defn *get-mt-lv-ess
  "getMtLvESS
  public static String getMtLvESS( int mtLv )
  Returns string. String length create indentation(shift) of other text.
  Indentation depends on method level - great method level, great indentation.
  Main method has method level 0.
  Other called method has method level 1, 2,...N.

  mt-lv - - method level - `int`

  returns: method level external shift string - `java.lang.String`"
  (^java.lang.String [^Integer mt-lv]
    (BTools/getMtLvESS mt-lv)))

(defn *get-s-int-a
  "getSIntA
  public static String getSIntA( int... intA )
  Returns intA converted to string.
  Strings are separated with \", \".
  If intA is null returns '?'.
  If intA.length is 0 returns '?'.

  int-a - - int value(s) (one or more) - `int`

  returns: int... as string - `java.lang.String`"
  (^java.lang.String [^Integer int-a]
    (BTools/getSIntA int-a)))

(defn *get-s-dbl
  "getSDbl
  public static String getSDbl( double Value, int DecPrec, boolean ShowPlusSign, int StringLength )
  Returns double converted to string.
  If Value is Double.NaN returns \"NaN\".
  If DecPrec is < 0 is DecPrec set 0.
  If ShowPlusSign is true:
  - If Value is > 0 sign is '+'.
  - If Value is 0 sign is ' '.
  If StringLength is > base double string length
  before base double string adds relevant spaces.
  If StringLength is <= base double string length
  returns base double string.

  value - - value - `double`
  dec-prec - - decimal precision - `int`
  show-plus-sign - - show plus sign - `boolean`
  string-length - - string length - `int`

  returns: double as string - `java.lang.String`"
  (^java.lang.String [^Double value ^Integer dec-prec ^Boolean show-plus-sign ^Integer string-length]
    (BTools/getSDbl value dec-prec show-plus-sign string-length))
  (^java.lang.String [^Double value ^Integer dec-prec ^Boolean show-plus-sign]
    (BTools/getSDbl value dec-prec show-plus-sign))
  (^java.lang.String [^Double value ^Integer dec-prec]
    (BTools/getSDbl value dec-prec)))

(defn *get-s-int
  "getSInt
  public static String getSInt( int Value, int CharsCount, char LeadingChar )
  Returns int converted to string.
  If CharsCount > base int string length
  before base int string adds relevant leading chars.
  If CharsCount <= base int string length
  returns base int string.

  value - - value - `int`
  chars-count - - chars count - `int`
  leading-char - - leading char - `char`

  returns: int as string - `java.lang.String`"
  (^java.lang.String [^Integer value ^Integer chars-count ^Character leading-char]
    (BTools/getSInt value chars-count leading-char))
  (^java.lang.String [^Integer value ^Integer chars-count]
    (BTools/getSInt value chars-count))
  (^java.lang.String [^Integer value]
    (BTools/getSInt value)))

(defn *get-mt-lv-iss
  "getMtLvISS
  public static String getMtLvISS()
  Returns string. String create indentation(shift)
  internal text to start text of method.

  returns: method level internal shift string - `java.lang.String`"
  (^java.lang.String []
    (BTools/getMtLvISS )))

(defn *get-s-bln
  "getSBln
  public static String getSBln( boolean... blnA )
  Returns boolean(s) converted to char (true = 'T'; false = 'F')
  If blnA.length is > 1 returns chars without separator.
  If blnA is '{ true, false, true }' returns 'TFT'.
  If blnA is null returns '?'.
  If blnA.length is 0 returns '?'.

  bln-a - `boolean`

  returns: boolean(s) as string - `java.lang.String`"
  (^java.lang.String [^Boolean bln-a]
    (BTools/getSBln bln-a)))

(defn *get-index-chars-count
  "getIndexCharsCount
  public static int getIndexCharsCount( int MaxIndex )
  Returns chars count for max value of index.
  Example: Max value of index is 150 and chars count is 3.
  It is important for statement of indexed values.
  Index columns can have the same width for all rouws.

  max-index - - max value of index - `int`

  returns: chars count for max value of index - `int`"
  (^Integer [^Integer max-index]
    (BTools/getIndexCharsCount max-index)))

(defn *get-s-lc-dt-tm
  "getSLcDtTm
  public static String getSLcDtTm( String FormatS )
  Returns local datetime as string.
  Datetime format is param.

  format-s - datetime format - `java.lang.String`

  returns: local datetime as string - `java.lang.String`"
  (^java.lang.String [^java.lang.String format-s]
    (BTools/getSLcDtTm format-s))
  (^java.lang.String []
    (BTools/getSLcDtTm )))

