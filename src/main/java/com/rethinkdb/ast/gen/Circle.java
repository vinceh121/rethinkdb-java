// Autogenerated by convert_protofile.py on 2015-05-06.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Circle extends RqlQuery {


    public Circle(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Circle(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Circle(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.CIRCLE, args, optargs);
    }
    protected Circle(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


}
