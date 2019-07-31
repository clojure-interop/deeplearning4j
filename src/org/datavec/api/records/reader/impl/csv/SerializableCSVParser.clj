(ns org.datavec.api.records.reader.impl.csv.SerializableCSVParser
  "A very simple CSV parser released under a commercial-friendly license.
 This just implements splitting a single line into fields."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.csv SerializableCSVParser]))

(defn ->serializable-csv-parser
  "Constructor.

  Constructs CSVReader with supplied separator and quote char.
  Allows setting the \"strict quotes\" and \"ignore leading whitespace\" flags

  separator - the delimiter to use for separating entries - `char`
  quotechar - the character to use for quoted elements - `char`
  escape - the character to use for escaping a separator or quote - `char`
  strict-quotes - if true, characters outside the quotes are ignored - `boolean`
  ignore-leading-white-space - if true, white space in front of a quote in a field is ignored - `boolean`"
  (^SerializableCSVParser [^Character separator ^Character quotechar ^Character escape ^Boolean strict-quotes ^Boolean ignore-leading-white-space]
    (new SerializableCSVParser separator quotechar escape strict-quotes ignore-leading-white-space))
  (^SerializableCSVParser [^Character separator ^Character quotechar ^Character escape ^Boolean strict-quotes]
    (new SerializableCSVParser separator quotechar escape strict-quotes))
  (^SerializableCSVParser [^Character separator ^Character quotechar ^Character escape]
    (new SerializableCSVParser separator quotechar escape))
  (^SerializableCSVParser [^Character separator ^Character quotechar]
    (new SerializableCSVParser separator quotechar))
  (^SerializableCSVParser [^Character separator]
    (new SerializableCSVParser separator))
  (^SerializableCSVParser []
    (new SerializableCSVParser )))

(def *-default-separator
  "Static Constant.

  The default separator to use if none is supplied to the constructor.

  type: char"
  SerializableCSVParser/DEFAULT_SEPARATOR)

(def *-initial-read-size
  "Static Constant.

  type: int"
  SerializableCSVParser/INITIAL_READ_SIZE)

(def *-default-quote-character
  "Static Constant.

  The default quote character to use if none is supplied to the
  constructor.

  type: char"
  SerializableCSVParser/DEFAULT_QUOTE_CHARACTER)

(def *-default-escape-character
  "Static Constant.

  The default escape character to use if none is supplied to the
  constructor.

  type: char"
  SerializableCSVParser/DEFAULT_ESCAPE_CHARACTER)

(def *-default-strict-quotes
  "Static Constant.

  The default strict quote behavior to use if none is supplied to the
  constructor

  type: boolean"
  SerializableCSVParser/DEFAULT_STRICT_QUOTES)

(def *-default-ignore-leading-whitespace
  "Static Constant.

  The default leading whitespace behavior to use if none is supplied to the
  constructor

  type: boolean"
  SerializableCSVParser/DEFAULT_IGNORE_LEADING_WHITESPACE)

(def *-null-character
  "Static Constant.

  This is the \"null\" character - if a value is set to this then it is ignored.
  I.E. if the quote character is set to null then there is no quote character.

  type: char"
  SerializableCSVParser/NULL_CHARACTER)

(defn pending?
  "returns: true if something was left over from last call(s) - `boolean`"
  (^Boolean [^SerializableCSVParser this]
    (-> this (.isPending))))

(defn parse-line-multi
  "next-line - `java.lang.String`

  returns: `java.lang.String[]`

  throws: java.io.IOException"
  ([^SerializableCSVParser this ^java.lang.String next-line]
    (-> this (.parseLineMulti next-line))))

(defn parse-line
  "next-line - `java.lang.String`

  returns: `java.lang.String[]`

  throws: java.io.IOException"
  ([^SerializableCSVParser this ^java.lang.String next-line]
    (-> this (.parseLine next-line))))

