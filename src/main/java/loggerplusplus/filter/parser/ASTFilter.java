/* Generated By:JJTree: Do not edit this line. ASTFilter.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package loggerplusplus.filter.parser;

public
class ASTFilter extends SimpleNode {
  public ASTFilter(int id) {
    super(id);
  }

  public ASTFilter(FilterParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(FilterParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=87ae40d900a3a05cc6e165cf305ff200 (do not edit this line) */