(ns org.datavec.api.conf.Configuration
  "Provides access to configuration parameters.
 Resources
 Configurations are specified by resources. A resource contains a set of
 name/value pairs as XML data. Each resource is named by either a
 String. If named by a String,
 then the classpath is examined for a file with that name. If named by a
 Path, then the local filesystem is examined directly, without
 referring to the classpath.
 Unless explicitly turned off, Hadoop by default specifies two
 resources, loaded in-order from the classpath:
 core-default.xml
 : Read-only defaults for hadoop.
 core-site.xml: Site-specific configuration for a given hadoop
 installation.

 Applications may add additional resources, which are loaded
 subsequent to these resources in the order they are added.
 Final Parameters
 Configuration parameters may be declared final.
 Once a resource declares a value final, no subsequently-loaded
 resource can alter that value.
 For example, one might define a final parameter with:


   <property>
     <name>dfs.client.buffer.dir</name>
     <value>/tmp/hadoop/dfs/client</value>
     <final>true</final>
   </property>
 Administrators typically define parameters as final in
 core-site.xml for values that user applications may not alter.
 Variable Expansion
 Value strings are first processed for variable expansion. The
 available properties are:
 Other properties defined in this Configuration; and, if a name is
 undefined here,
 Properties in System.getProperties().

 For example, if a configuration resource contains the following property
 definitions:


   <property>
     <name>basedir</name>
     <value>/user/${user.name}</value>
   </property>

   <property>
     <name>tempdir</name>
     <value>${basedir}/tmp</value>
   </property>
 When conf.get(\"tempdir\") is called, then ${basedir}
 will be resolved to another property in this Configuration, while
 ${user.name} would then ordinarily be resolved to the value
 of the System property with that name."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.conf Configuration]))

(defn ->configuration
  "Constructor.

  A new configuration where the behavior of reading from the default
  resources can be turned off.
  If the parameter loadDefaults is false, the new instance
  will not load resources from the default files.

  load-defaults - specifies whether to load from the default files - `boolean`"
  (^Configuration [^Boolean load-defaults]
    (new Configuration load-defaults))
  (^Configuration []
    (new Configuration )))

(defn *add-default-resource
  "Add a default resource. Resources are loaded in the order of the resources
  added.

  name - file name. File should be present in the classpath. - `java.lang.String`"
  ([^java.lang.String name]
    (Configuration/addDefaultResource name)))

(defn *dump-configuration
  "Writes out all the parameters and their properties (final and resource) to
  the given Writer
  The format of the output would be
  { \"properties\" : [ {key1,value1,key1.isFinal,key1.resource}, {key2,value2,
  key2.isFinal,key2.resource}... ] }
  It does not output the parameters of the configuration object which is
  loaded from an input stream.

  conf - `org.datavec.api.conf.Configuration`
  out - the Writer to write to - `java.io.Writer`

  throws: java.io.IOException"
  ([^org.datavec.api.conf.Configuration conf ^java.io.Writer out]
    (Configuration/dumpConfiguration conf out)))

(defn *main
  "For debugging. List non-default properties to the terminal and exit.

  args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([args]
    (Configuration/main args)))

(defn get-pattern
  "Get the value of the name property as a Pattern.
  If no such property is specified, or if the specified value is not a valid
  Pattern, then DefaultValue is returned.

  name - property name - `java.lang.String`
  default-value - default value - `java.util.regex.Pattern`

  returns: property value as a compiled Pattern, or defaultValue - `java.util.regex.Pattern`"
  (^java.util.regex.Pattern [^Configuration this ^java.lang.String name ^java.util.regex.Pattern default-value]
    (-> this (.getPattern name default-value))))

(defn add-resource
  "Add a configuration resource.
  The properties of this resource will override properties of previously
  added resources, unless they were marked final.

  name - resource to be added, the classpath is examined for a filewith that name. - `java.lang.String`"
  ([^Configuration this ^java.lang.String name]
    (-> this (.addResource name))))

(defn set-boolean-if-unset
  "Set the given property, if it is currently unset.

  name - property name - `java.lang.String`
  value - new value - `boolean`"
  ([^Configuration this ^java.lang.String name ^Boolean value]
    (-> this (.setBooleanIfUnset name value))))

(defn get-trimmed-string-collection
  "Get the comma delimited values of the name property as
  a collection of Strings, trimmed of the leading and trailing whitespace.
  If no such property is specified then empty Collection is returned.

  name - property name. - `java.lang.String`

  returns: property value as a collection of Strings, or empty Collection - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^Configuration this ^java.lang.String name]
    (-> this (.getTrimmedStringCollection name))))

(defn set-boolean
  "Set the value of the name property to a boolean.

  name - property name. - `java.lang.String`
  value - boolean value of the property. - `boolean`"
  ([^Configuration this ^java.lang.String name ^Boolean value]
    (-> this (.setBoolean name value))))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^Configuration this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^Configuration this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn get-resource
  "Get the URL for the named resource.

  name - resource name. - `java.lang.String`

  returns: the url for the named resource. - `java.net.URL`"
  (^java.net.URL [^Configuration this ^java.lang.String name]
    (-> this (.getResource name))))

(defn get-instances
  "Get the value of the name property as a List
  of objects implementing the interface specified by xface.
  An exception is thrown if any of the classes does not exist, or if it does
  not implement the named interface.

  name - the property name. - `java.lang.String`
  xface - the interface implemented by the classes named byname. - `java.lang.Class`

  returns: a List of objects implementing xface. - `<U> java.util.List<U>`"
  ([^Configuration this ^java.lang.String name ^java.lang.Class xface]
    (-> this (.getInstances name xface))))

(defn get-trimmed-strings
  "Get the comma delimited values of the name property as
  an array of Strings, trimmed of the leading and trailing whitespace.
  If no such property is specified then default value is returned.

  name - property name. - `java.lang.String`
  default-value - The default value - `java.lang.String`

  returns: property value as an array of trimmed Strings,
  or default value. - `java.lang.String[]`"
  ([^Configuration this ^java.lang.String name ^java.lang.String default-value]
    (-> this (.getTrimmedStrings name default-value)))
  ([^Configuration this ^java.lang.String name]
    (-> this (.getTrimmedStrings name))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^Configuration this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn get-raw
  "Get the value of the name property, without doing
  variable expansion.

  name - the property name. - `java.lang.String`

  returns: the value of the name property,
  or null if no such property exists. - `java.lang.String`"
  (^java.lang.String [^Configuration this ^java.lang.String name]
    (-> this (.getRaw name))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^Configuration this]
    (-> this (.toDouble))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Configuration this]
    (-> this (.toString))))

(defn get-string-collection
  "Get the comma delimited values of the name property as
  a collection of Strings.
  If no such property is specified then empty collection is returned.

  This is an optimized version of getStrings(String)

  name - property name. - `java.lang.String`

  returns: property value as a collection of Strings. - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^Configuration this ^java.lang.String name]
    (-> this (.getStringCollection name))))

(defn get-classes
  "Get the value of the name property
  as an array of Class.
  The value of the property specifies a list of comma separated class names.
  If no such property is specified, then defaultValue is
  returned.

  name - the property name. - `java.lang.String`
  default-value - default value. - `java.lang.Class`

  returns: property value as a Class[],
  or defaultValue. - `java.lang.Class<?>[]`"
  ([^Configuration this ^java.lang.String name ^java.lang.Class default-value]
    (-> this (.getClasses name default-value))))

(defn iterator
  "Get an Iterator to go through the list of String
  key-value pairs in the configuration.

  returns: an iterator over the entries. - `java.util.Iterator<java.util.Map.Entry<java.lang.String,java.lang.String>>`"
  (^java.util.Iterator [^Configuration this]
    (-> this (.iterator))))

(defn get-long
  "Get the value of the name property as a long.
  If no such property is specified, or if the specified value is not a valid
  long, then defaultValue is returned.

  name - property name. - `java.lang.String`
  default-value - default value. - `long`

  returns: property value as a long,
  or defaultValue. - `long`"
  (^Long [^Configuration this ^java.lang.String name ^Long default-value]
    (-> this (.getLong name default-value))))

(defn write-xml
  "Write out the non-default properties in this configuration to the give
  OutputStream.

  out - the output stream to write to. - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^Configuration this ^java.io.OutputStream out]
    (-> this (.writeXml out))))

(defn set-quiet-mode
  "Set the quietness-mode.
  In the quiet-mode, error and informational messages might not be logged.

  quietmode - true to set quiet-mode on, falseto turn it off. - `boolean`"
  ([^Configuration this ^Boolean quietmode]
    (-> this (.setQuietMode quietmode))))

(defn get-class-loader
  "Get the ClassLoader for this job.

  returns: the correct class loader. - `java.lang.ClassLoader`"
  (^java.lang.ClassLoader [^Configuration this]
    (-> this (.getClassLoader))))

(defn get-int
  "Get the value of the name property as an int.
  If no such property exists, or if the specified value is not a valid
  int, then defaultValue is returned.

  name - property name. - `java.lang.String`
  default-value - default value. - `int`

  returns: property value as an int,
  or defaultValue. - `int`"
  (^Integer [^Configuration this ^java.lang.String name ^Integer default-value]
    (-> this (.getInt name default-value))))

(defn set-long
  "Set the value of the name property to a long.

  name - property name. - `java.lang.String`
  value - long value of the property. - `long`"
  ([^Configuration this ^java.lang.String name ^Long value]
    (-> this (.setLong name value))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^Configuration this]
    (-> this (.toFloat))))

(defn set-if-unset
  "Sets a property if it is currently unset.

  name - the property name - `java.lang.String`
  value - the new value - `java.lang.String`"
  ([^Configuration this ^java.lang.String name ^java.lang.String value]
    (-> this (.setIfUnset name value))))

(defn get-strings
  "Get the comma delimited values of the name property as
  an array of Strings.
  If no such property is specified then default value is returned.

  name - property name. - `java.lang.String`
  default-value - The default value - `java.lang.String`

  returns: property value as an array of Strings,
  or default value. - `java.lang.String[]`"
  ([^Configuration this ^java.lang.String name ^java.lang.String default-value]
    (-> this (.getStrings name default-value)))
  ([^Configuration this ^java.lang.String name]
    (-> this (.getStrings name))))

(defn get-range
  "Parse the given attribute as a set of integer ranges

  name - the attribute name - `java.lang.String`
  default-value - the default value if it is not set - `java.lang.String`

  returns: a new set of ranges from the configured value - `org.datavec.api.conf.Configuration$IntegerRanges`"
  (^org.datavec.api.conf.Configuration$IntegerRanges [^Configuration this ^java.lang.String name ^java.lang.String default-value]
    (-> this (.getRange name default-value))))

(defn get-char
  "Get the char value of the name property, null if
  no such property exists.
  Values are processed for variable expansion
  before being returned.

  name - the property name. - `java.lang.String`
  default-value - `char`

  returns: the value of the name property,
  or null if no such property exists. - `char`"
  (^Character [^Configuration this ^java.lang.String name ^Character default-value]
    (-> this (.getChar name default-value)))
  (^Character [^Configuration this ^java.lang.String name]
    (-> this (.getChar name))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^Configuration this]
    (-> this (.toLong))))

(defn set-pattern
  "Set the given property to Pattern.
  If the pattern is passed as null, sets the empty pattern which results in
  further calls to getPattern(...) returning the default value.

  name - property name - `java.lang.String`
  pattern - new value - `java.util.regex.Pattern`"
  ([^Configuration this ^java.lang.String name ^java.util.regex.Pattern pattern]
    (-> this (.setPattern name pattern))))

(defn set-int
  "Set the value of the name property to an int.

  name - property name. - `java.lang.String`
  value - int value of the property. - `int`"
  ([^Configuration this ^java.lang.String name ^Integer value]
    (-> this (.setInt name value))))

(defn reload-configuration
  "Reload configuration from previously added resources.
  This method will clear all the configuration read from the added
  resources, and final parameters. This will make the resources to
  be read again before accessing the values. Values that are added
  via set methods will overlay values read from the resources."
  ([^Configuration this]
    (-> this (.reloadConfiguration))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^Configuration this]
    (-> this (.toInt))))

(defn get-file
  "Get a local file name under a directory named in dirsProp with
  the given path. If dirsProp contains multiple directories,
  then one is chosen based on path's hash code. If the selected
  directory does not exist, an attempt is made to create it.

  dirs-prop - directory in which to locate the file. - `java.lang.String`
  path - file-path. - `java.lang.String`

  returns: local file under the directory with the given path. - `java.io.File`

  throws: java.io.IOException"
  (^java.io.File [^Configuration this ^java.lang.String dirs-prop ^java.lang.String path]
    (-> this (.getFile dirs-prop path))))

(defn set
  "Set the value of the name property.

  name - property name. - `java.lang.String`
  value - property value. - `java.lang.String`"
  ([^Configuration this ^java.lang.String name ^java.lang.String value]
    (-> this (.set name value))))

(defn get-boolean?
  "Get the value of the name property as a boolean.
  If no such property is specified, or if the specified value is not a valid
  boolean, then defaultValue is returned.

  name - property name. - `java.lang.String`
  default-value - default value. - `boolean`

  returns: property value as a boolean,
  or defaultValue. - `boolean`"
  (^Boolean [^Configuration this ^java.lang.String name ^Boolean default-value]
    (-> this (.getBoolean name default-value))))

(defn size
  "Return the number of keys in the configuration.

  returns: number of keys in the configuration. - `int`"
  (^Integer [^Configuration this]
    (-> this (.size))))

(defn set-class-loader
  "Set the class loader that will be used to load the various objects.

  class-loader - the new class loader. - `java.lang.ClassLoader`"
  ([^Configuration this ^java.lang.ClassLoader class-loader]
    (-> this (.setClassLoader class-loader))))

(defn clear
  "Clears all keys from the configuration."
  ([^Configuration this]
    (-> this (.clear))))

(defn get-conf-resource-as-reader
  "Get a Reader attached to the configuration resource with the
  given name.

  name - configuration resource name. - `java.lang.String`

  returns: a reader attached to the resource. - `java.io.Reader`"
  (^java.io.Reader [^Configuration this ^java.lang.String name]
    (-> this (.getConfResourceAsReader name))))

(defn get-float
  "Get the value of the name property as a float.
  If no such property is specified, or if the specified value is not a valid
  float, then defaultValue is returned.

  name - property name. - `java.lang.String`
  default-value - default value. - `float`

  returns: property value as a float,
  or defaultValue. - `float`"
  (^Float [^Configuration this ^java.lang.String name ^Float default-value]
    (-> this (.getFloat name default-value))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^Configuration this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn get-class-by-name
  "Load a class by name.

  name - the class name. - `java.lang.String`

  returns: the class object. - `java.lang.Class<?>`

  throws: java.lang.ClassNotFoundException - if the class is not found."
  (^java.lang.Class [^Configuration this ^java.lang.String name]
    (-> this (.getClassByName name))))

(defn get
  "Get the value of the name property. If no such property
  exists, then defaultValue is returned.

  name - property name. - `java.lang.String`
  default-value - default value. - `java.lang.String`

  returns: property value, or defaultValue if the property
  doesn't exist. - `java.lang.String`"
  (^java.lang.String [^Configuration this ^java.lang.String name ^java.lang.String default-value]
    (-> this (.get name default-value)))
  (^java.lang.String [^Configuration this ^java.lang.String name]
    (-> this (.get name))))

(defn get-conf-resource-as-input-stream
  "Get an input stream attached to the configuration resource with the
  given name.

  name - configuration resource name. - `java.lang.String`

  returns: an input stream attached to the resource. - `java.io.InputStream`"
  (^java.io.InputStream [^Configuration this ^java.lang.String name]
    (-> this (.getConfResourceAsInputStream name))))

(defn set-float
  "Set the value of the name property to a float.

  name - property name. - `java.lang.String`
  value - property value. - `float`"
  ([^Configuration this ^java.lang.String name ^Float value]
    (-> this (.setFloat name value))))

(defn get-class
  "Get the value of the name property as a Class
  implementing the interface specified by xface.
  If no such property is specified, then defaultValue is
  returned.
  An exception is thrown if the returned class does not implement the named
  interface.

  name - the class name. - `java.lang.String`
  default-value - default value. - `java.lang.Class`
  xface - the interface implemented by the named class. - `java.lang.Class`

  returns: property value as a Class,
  or defaultValue. - `<U> java.lang.Class<? extends U>`"
  ([^Configuration this ^java.lang.String name ^java.lang.Class default-value ^java.lang.Class xface]
    (-> this (.getClass name default-value xface)))
  (^java.lang.Class [^Configuration this ^java.lang.String name ^java.lang.Class default-value]
    (-> this (.getClass name default-value))))

(defn set-strings
  "Set the array of string values for the name property as
  as comma delimited values.

  name - property name. - `java.lang.String`
  values - The values - `java.lang.String`"
  ([^Configuration this ^java.lang.String name ^java.lang.String values]
    (-> this (.setStrings name values))))

(defn set-class
  "Set the value of the name property to the name of a
  theClass implementing the given interface xface.
  An exception is thrown if theClass does not implement the
  interface xface.

  name - property name. - `java.lang.String`
  the-class - property value. - `java.lang.Class`
  xface - the interface implemented by the named class. - `java.lang.Class`"
  ([^Configuration this ^java.lang.String name ^java.lang.Class the-class ^java.lang.Class xface]
    (-> this (.setClass name the-class xface))))

