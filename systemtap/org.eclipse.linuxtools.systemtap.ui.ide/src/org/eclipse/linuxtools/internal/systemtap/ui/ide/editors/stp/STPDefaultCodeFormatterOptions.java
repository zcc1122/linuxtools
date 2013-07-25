/*******************************************************************************
 * Copyright (c) 2000, 2012, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Sergey Prigogin (Google)
 *     Anton Leherbauer (Wind River Systems)
 *     Red Hat Inc. - modified for use in SystemTap
 *******************************************************************************/
package org.eclipse.linuxtools.internal.systemtap.ui.ide.editors.stp;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.linuxtools.internal.systemtap.ui.ide.IDEPlugin;

/**
 * Code formatter options.
 * 
 * @noextend This class is not intended to be subclassed by clients.
 * @since 5.4
 */
public class STPDefaultCodeFormatterOptions {
	public static final int TAB = 1;
	public static final int SPACE = 2;
	public static final int MIXED = 4;

	public static STPDefaultCodeFormatterOptions getDefaultSettings() {
		STPDefaultCodeFormatterOptions options = new STPDefaultCodeFormatterOptions();
		options.setDefaultSettings();
		return options;
	}

	public static STPDefaultCodeFormatterOptions getKandRSettings() {
		STPDefaultCodeFormatterOptions options = new STPDefaultCodeFormatterOptions();
		options.setKandRSettings();
		return options;
	}

	public static STPDefaultCodeFormatterOptions getAllmanSettings() {
		STPDefaultCodeFormatterOptions options = new STPDefaultCodeFormatterOptions();
		options.setAllmanSettings();
		return options;
	}

	public static STPDefaultCodeFormatterOptions getGNUSettings() {
		STPDefaultCodeFormatterOptions options = new STPDefaultCodeFormatterOptions();
		options.setGNUSettings();
		return options;
	}

	public static STPDefaultCodeFormatterOptions getWhitesmithsSettings() {
		STPDefaultCodeFormatterOptions options = new STPDefaultCodeFormatterOptions();
		options.setWhitesmitsSettings();
		return options;
	}

	public int alignment_for_arguments_in_method_invocation;
	public int alignment_for_assignment;
	public int alignment_for_base_clause_in_type_declaration;
	public int alignment_for_binary_expression;
	public int alignment_for_compact_if;
	public int alignment_for_conditional_expression_chain;
	public int alignment_for_conditional_expression;
	public int alignment_for_declarator_list;
	public int alignment_for_enumerator_list;
	public int alignment_for_expression_list;
	public int alignment_for_expressions_in_initializer_list;
	public int alignment_for_member_access;
	public int alignment_for_overloaded_left_shift_chain;
	public int alignment_for_parameters_in_method_declaration;
	public int alignment_for_throws_clause_in_method_declaration;
	public int alignment_for_constructor_initializer_list;

//	public boolean align_type_members_on_columns;

	public String brace_position_for_block;
	public String brace_position_for_block_in_case;
//	public String brace_position_for_enum_declaration;
	public String brace_position_for_initializer_list;
	public String brace_position_for_method_declaration;
	public String brace_position_for_namespace_declaration;
	public String brace_position_for_switch;
	public String brace_position_for_type_declaration;

//	public int blank_lines_after_includes;
//	public int blank_lines_at_beginning_of_method_body;
//	public int blank_lines_before_field;
//	public int blank_lines_before_first_class_body_declaration;
//	public int blank_lines_before_includes;
//	public int blank_lines_before_member_type;
//	public int blank_lines_before_method;
//	public int blank_lines_before_new_chunk;
//	public int blank_lines_between_type_declarations;
	
//	public boolean comment_clear_blank_lines;
//	public boolean comment_format;
//	public boolean comment_format_header;
//	public boolean comment_format_html;
//	public boolean comment_format_source;
//	public int comment_line_length;
	public int comment_min_distance_between_code_and_line_comment;
	public boolean comment_preserve_white_space_between_code_and_line_comment;
	public boolean never_indent_line_comments_on_first_column;
	
	public int continuation_indentation;
	public int continuation_indentation_for_initializer_list;

	public boolean indent_statements_compare_to_block;
	public boolean indent_statements_compare_to_body;
	public boolean indent_body_declarations_compare_to_access_specifier;
	public boolean indent_access_specifier_compare_to_type_header;
	public int indent_access_specifier_extra_spaces;
	public boolean indent_body_declarations_compare_to_namespace_header;
	public boolean indent_declaration_compare_to_template_header;
	public boolean indent_breaks_compare_to_cases;
	public boolean indent_empty_lines;
	public boolean indent_switchstatements_compare_to_cases;
	public boolean indent_switchstatements_compare_to_switch;
	public int indentation_size;

	public boolean insert_new_line_after_opening_brace_in_initializer_list;
	public boolean insert_new_line_after_template_declaration;
	public boolean insert_new_line_at_end_of_file_if_missing;
	public boolean insert_new_line_before_catch_in_try_statement;
	public boolean insert_new_line_before_closing_brace_in_initializer_list;
	public boolean insert_new_line_before_colon_in_constructor_initializer_list;
	public boolean insert_new_line_before_else_in_if_statement;
	public boolean insert_new_line_before_while_in_do_statement;
	public boolean insert_new_line_before_identifier_in_function_declaration;
	public boolean insert_new_line_in_empty_block;
//	public boolean insert_new_line_in_empty_method_body;
//	public boolean insert_new_line_in_empty_type_declaration;
	public boolean insert_space_after_assignment_operator;
	public boolean insert_space_after_binary_operator;
	public boolean insert_space_after_closing_angle_bracket_in_template_arguments;
	public boolean insert_space_after_closing_angle_bracket_in_template_parameters;
	public boolean insert_space_after_closing_paren_in_cast;
	public boolean insert_space_after_closing_brace_in_block;
	public boolean insert_space_after_colon_in_base_clause;
	public boolean insert_space_after_colon_in_case;
	public boolean insert_space_after_colon_in_conditional;
	public boolean insert_space_after_colon_in_labeled_statement;
//	public boolean insert_space_after_comma_in_allocation_expression;
	public boolean insert_space_after_comma_in_initializer_list;
	public boolean insert_space_after_comma_in_enum_declarations;
//	public boolean insert_space_after_comma_in_for_increments;
//	public boolean insert_space_after_comma_in_for_inits;
	public boolean insert_space_after_comma_in_method_invocation_arguments;
	public boolean insert_space_after_comma_in_method_declaration_parameters;
	public boolean insert_space_after_comma_in_method_declaration_throws;
	public boolean insert_space_after_comma_in_declarator_list;
	public boolean insert_space_after_comma_in_expression_list;
	public boolean insert_space_after_comma_in_base_types;
	public boolean insert_space_after_comma_in_template_arguments;
	public boolean insert_space_after_comma_in_template_parameters;
//	public boolean insert_space_after_ellipsis;
	public boolean insert_space_after_opening_angle_bracket_in_template_arguments;
	public boolean insert_space_after_opening_angle_bracket_in_template_parameters;
	public boolean insert_space_after_opening_bracket;
	public boolean insert_space_after_opening_brace_in_initializer_list;
	public boolean insert_space_after_opening_paren_in_cast;
	public boolean insert_space_after_opening_paren_in_catch;
	public boolean insert_space_after_opening_paren_in_for;
	public boolean insert_space_after_opening_paren_in_if;
	public boolean insert_space_after_opening_paren_in_method_declaration;
	public boolean insert_space_after_opening_paren_in_method_invocation;
	public boolean insert_space_after_opening_paren_in_exception_specification;
	public boolean insert_space_after_opening_paren_in_parenthesized_expression;
	public boolean insert_space_after_opening_paren_in_switch;
	public boolean insert_space_after_opening_paren_in_while;
	public boolean insert_space_after_postfix_operator;
	public boolean insert_space_after_prefix_operator;
	public boolean insert_space_after_question_in_conditional;
	public boolean insert_space_after_semicolon_in_for;
	public boolean insert_space_after_unary_operator;
	public boolean insert_space_before_assignment_operator;
	public boolean insert_space_before_binary_operator;
	public boolean insert_space_before_closing_angle_bracket_in_template_arguments;
	public boolean insert_space_before_closing_angle_bracket_in_template_parameters;
	public boolean insert_space_before_closing_brace_in_initializer_list;
	public boolean insert_space_before_closing_bracket;
	public boolean insert_space_before_closing_paren_in_cast;
	public boolean insert_space_before_closing_paren_in_catch;
	public boolean insert_space_before_closing_paren_in_for;
	public boolean insert_space_before_closing_paren_in_if;
	public boolean insert_space_before_closing_paren_in_method_declaration;
	public boolean insert_space_before_closing_paren_in_method_invocation;
	public boolean insert_space_before_closing_paren_in_exception_specification;
	public boolean insert_space_before_closing_paren_in_parenthesized_expression;
	public boolean insert_space_before_closing_paren_in_switch;
	public boolean insert_space_before_closing_paren_in_while;
	public boolean insert_space_before_colon_in_base_clause;
	public boolean insert_space_before_colon_in_case;
	public boolean insert_space_before_colon_in_conditional;
	public boolean insert_space_before_colon_in_default;
	public boolean insert_space_before_colon_in_labeled_statement;
//	public boolean insert_space_before_comma_in_allocation_expression;
	public boolean insert_space_before_comma_in_initializer_list;
	public boolean insert_space_before_comma_in_enum_declarations;
//	public boolean insert_space_before_comma_in_for_increments;
//	public boolean insert_space_before_comma_in_for_inits;
	public boolean insert_space_before_comma_in_method_invocation_arguments;
	public boolean insert_space_before_comma_in_method_declaration_parameters;
	public boolean insert_space_before_comma_in_method_declaration_throws;
	public boolean insert_space_before_comma_in_declarator_list;
	public boolean insert_space_before_comma_in_expression_list;
	public boolean insert_space_before_comma_in_base_types;
	public boolean insert_space_before_comma_in_template_arguments;
	public boolean insert_space_before_comma_in_template_parameters;
//	public boolean insert_space_before_ellipsis;
//	public boolean insert_space_before_parenthesized_expression_in_return;
	public boolean insert_space_before_opening_angle_bracket_in_template_arguments;
	public boolean insert_space_before_opening_angle_bracket_in_template_parameters;
	public boolean insert_space_before_opening_brace_in_initializer_list;
	public boolean insert_space_before_opening_brace_in_block;
	public boolean insert_space_before_opening_brace_in_method_declaration;
	public boolean insert_space_before_opening_brace_in_type_declaration;
	public boolean insert_space_before_opening_brace_in_namespace_declaration;
	public boolean insert_space_before_opening_bracket;
	public boolean insert_space_before_opening_paren_in_catch;
	public boolean insert_space_before_opening_paren_in_for;
	public boolean insert_space_before_opening_paren_in_if;
	public boolean insert_space_before_opening_paren_in_method_invocation;
	public boolean insert_space_before_opening_paren_in_exception_specification;
	public boolean insert_space_before_opening_paren_in_method_declaration;
	public boolean insert_space_before_opening_paren_in_switch;
	public boolean insert_space_before_opening_brace_in_switch;
	public boolean insert_space_before_opening_paren_in_parenthesized_expression;
	public boolean insert_space_before_opening_paren_in_while;
	public boolean insert_space_before_postfix_operator;
	public boolean insert_space_before_prefix_operator;
	public boolean insert_space_before_question_in_conditional;
	public boolean insert_space_before_semicolon;
	public boolean insert_space_before_semicolon_in_for;
	public boolean insert_space_before_unary_operator;
	public boolean insert_space_between_empty_braces_in_initializer_list;
	public boolean insert_space_between_empty_brackets;
	public boolean insert_space_between_empty_parens_in_method_declaration;
	public boolean insert_space_between_empty_parens_in_method_invocation;
	public boolean insert_space_between_empty_parens_in_exception_specification;
	public boolean compact_else_if;
	public boolean keep_guardian_clause_on_one_line;
	public boolean keep_else_statement_on_same_line;
	public boolean keep_empty_initializer_list_on_one_line;
	public boolean keep_simple_if_on_one_line;
	public boolean keep_then_statement_on_same_line;
	public int number_of_empty_lines_to_preserve;
	public boolean join_wrapped_lines;
	public boolean put_empty_statement_on_new_line;
	public int tab_size;
	public int page_width;
	public int tab_char = TAB;
	public boolean use_tabs_only_for_leading_indentations;
	public int initial_indentation_level;
	public String line_separator;
	
	private STPDefaultCodeFormatterOptions() {
		// cannot be instantiated
	}

	public STPDefaultCodeFormatterOptions(Map<String, String> settings) {
		setDefaultSettings();
		if (settings == null) return;
		set(settings);
	}

	private String getAlignment(int alignment) {
		return Integer.toString(alignment);
	}

	public Map<String, String> getMap() {
		Map<String, String> options = new HashMap<String, String>();
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_ALLOCATION_EXPRESSION, getAlignment(this.alignment_for_arguments_in_allocation_expression));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_METHOD_INVOCATION, getAlignment(this.alignment_for_arguments_in_method_invocation));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ASSIGNMENT, getAlignment(this.alignment_for_assignment));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_BINARY_EXPRESSION, getAlignment(this.alignment_for_binary_expression));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_COMPACT_IF, getAlignment(this.alignment_for_compact_if));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_CONDITIONAL_EXPRESSION, getAlignment(this.alignment_for_conditional_expression));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_CONDITIONAL_EXPRESSION_CHAIN, getAlignment(this.alignment_for_conditional_expression_chain));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_DECLARATOR_LIST, getAlignment(this.alignment_for_declarator_list));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ENUMERATOR_LIST, getAlignment(this.alignment_for_enumerator_list));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_EXPRESSIONS_IN_INITIALIZER_LIST, getAlignment(this.alignment_for_expressions_in_initializer_list));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_EXPRESSION_LIST, getAlignment(this.alignment_for_expression_list));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_MEMBER_ACCESS, getAlignment(this.alignment_for_member_access));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_OVERLOADED_LEFT_SHIFT_CHAIN, getAlignment(this.alignment_for_overloaded_left_shift_chain));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_PARAMETERS_IN_METHOD_DECLARATION, getAlignment(this.alignment_for_parameters_in_method_declaration));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_SELECTOR_IN_METHOD_INVOCATION, getAlignment(this.alignment_for_selector_in_method_invocation));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_BASE_CLAUSE_IN_TYPE_DECLARATION, getAlignment(this.alignment_for_base_clause_in_type_declaration));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_CONSTRUCTOR_INITIALIZER_LIST, getAlignment(this.alignment_for_constructor_initializer_list));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_THROWS_CLAUSE_IN_METHOD_DECLARATION, getAlignment(this.alignment_for_throws_clause_in_method_declaration));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_ALIGN_TYPE_MEMBERS_ON_COLUMNS, this.align_type_members_on_columns ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AFTER_IMPORTS, Integer.toString(this.blank_lines_after_includes));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_FIELD, Integer.toString(this.blank_lines_before_field));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_FIRST_CLASS_BODY_DECLARATION, Integer.toString(this.blank_lines_before_first_class_body_declaration));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_IMPORTS, Integer.toString(this.blank_lines_before_includes));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_MEMBER_TYPE, Integer.toString(this.blank_lines_before_member_type));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_METHOD, Integer.toString(this.blank_lines_before_method));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_NEW_CHUNK, Integer.toString(this.blank_lines_before_new_chunk));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BETWEEN_TYPE_DECLARATIONS, Integer.toString(this.blank_lines_between_type_declarations));
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AT_BEGINNING_OF_METHOD_BODY, Integer.toString(this.blank_lines_at_beginning_of_method_body));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_INITIALIZER_LIST, this.brace_position_for_initializer_list);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_BLOCK, this.brace_position_for_block);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_BLOCK_IN_CASE, this.brace_position_for_block_in_case);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ENUM_DECLARATION, this.brace_position_for_enum_declaration);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_METHOD_DECLARATION, this.brace_position_for_method_declaration);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION, this.brace_position_for_type_declaration);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_SWITCH, this.brace_position_for_switch);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_NAMESPACE_DECLARATION, this.brace_position_for_namespace_declaration);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_CLEAR_BLANK_LINES, this.comment_clear_blank_lines ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT, this.comment_format ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_HEADER, this.comment_format_header ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_HTML, this.comment_format_html ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_SOURCE, this.comment_format_source ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_LINE_LENGTH, Integer.toString(this.comment_line_length));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_MIN_DISTANCE_BETWEEN_CODE_AND_LINE_COMMENT, Integer.toString(this.comment_min_distance_between_code_and_line_comment));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_PRESERVE_WHITE_SPACE_BETWEEN_CODE_AND_LINE_COMMENT, this.comment_preserve_white_space_between_code_and_line_comment ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_NEVER_INDENT_LINE_COMMENTS_ON_FIRST_COLUMN, this.never_indent_line_comments_on_first_column ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_CONTINUATION_INDENTATION, Integer.toString(this.continuation_indentation));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_CONTINUATION_INDENTATION_FOR_INITIALIZER_LIST, Integer.toString(this.continuation_indentation_for_initializer_list));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BLOCK, this.indent_statements_compare_to_block ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BODY, this.indent_statements_compare_to_body ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_ACCESS_SPECIFIER, this.indent_body_declarations_compare_to_access_specifier ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_ACCESS_SPECIFIER_COMPARE_TO_TYPE_HEADER, this.indent_access_specifier_compare_to_type_header ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_ACCESS_SPECIFIER_EXTRA_SPACES, String.valueOf(this.indent_access_specifier_extra_spaces));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_DECLARATION_COMPARE_TO_TEMPLATE_HEADER, this.indent_declaration_compare_to_template_header? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_NAMESPACE_HEADER, this.indent_body_declarations_compare_to_namespace_header ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_BREAKS_COMPARE_TO_CASES, this.indent_breaks_compare_to_cases ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_EMPTY_LINES, this.indent_empty_lines ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_CASES, this.indent_switchstatements_compare_to_cases ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_SWITCH, this.indent_switchstatements_compare_to_switch ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INDENTATION_SIZE, Integer.toString(this.indentation_size));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AFTER_OPENING_BRACE_IN_INITIALIZER_LIST, this.insert_new_line_after_opening_brace_in_initializer_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AFTER_TEMPLATE_DECLARATION, this.insert_new_line_after_template_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AT_END_OF_FILE_IF_MISSING, this.insert_new_line_at_end_of_file_if_missing ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_CATCH_IN_TRY_STATEMENT, this.insert_new_line_before_catch_in_try_statement? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_CLOSING_BRACE_IN_INITIALIZER_LIST, this.insert_new_line_before_closing_brace_in_initializer_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_COLON_IN_CONSTRUCTOR_INITIALIZER_LIST, this.insert_new_line_before_colon_in_constructor_initializer_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_ELSE_IN_IF_STATEMENT, this.insert_new_line_before_else_in_if_statement? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_WHILE_IN_DO_STATEMENT, this.insert_new_line_before_while_in_do_statement? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_IDENTIFIER_IN_FUNCTION_DECLARATION, this.insert_new_line_before_identifier_in_function_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_BLOCK, this.insert_new_line_in_empty_block? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_METHOD_BODY, this.insert_new_line_in_empty_method_body? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_TYPE_DECLARATION, this.insert_new_line_in_empty_type_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_ASSIGNMENT_OPERATOR, this.insert_space_after_assignment_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_BINARY_OPERATOR, this.insert_space_after_binary_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS, this.insert_space_after_closing_angle_bracket_in_template_arguments ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS, this.insert_space_after_closing_angle_bracket_in_template_parameters ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_PAREN_IN_CAST, this.insert_space_after_closing_paren_in_cast? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_BRACE_IN_BLOCK, this.insert_space_after_closing_brace_in_block? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_BASE_CLAUSE, this.insert_space_after_colon_in_base_clause ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CASE, this.insert_space_after_colon_in_case ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CONDITIONAL, this.insert_space_after_colon_in_conditional ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_LABELED_STATEMENT, this.insert_space_after_colon_in_labeled_statement? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ALLOCATION_EXPRESSION, this.insert_space_after_comma_in_allocation_expression? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_INITIALIZER_LIST, this.insert_space_after_comma_in_initializer_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ENUM_DECLARATIONS, this.insert_space_after_comma_in_enum_declarations ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_FOR_INCREMENTS, this.insert_space_after_comma_in_for_increments? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_FOR_INITS, this.insert_space_after_comma_in_for_inits? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_INVOCATION_ARGUMENTS, this.insert_space_after_comma_in_method_invocation_arguments? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_PARAMETERS, this.insert_space_after_comma_in_method_declaration_parameters? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_THROWS, this.insert_space_after_comma_in_method_declaration_throws? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_DECLARATOR_LIST, this.insert_space_after_comma_in_declarator_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_EXPRESSION_LIST, this.insert_space_after_comma_in_expression_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_BASE_TYPES, this.insert_space_after_comma_in_base_types? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TEMPLATE_ARGUMENTS, this.insert_space_after_comma_in_template_arguments ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TEMPLATE_PARAMETERS, this.insert_space_after_comma_in_template_parameters ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_ELLIPSIS, this.insert_space_after_ellipsis ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS, this.insert_space_after_opening_angle_bracket_in_template_arguments? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS, this.insert_space_after_opening_angle_bracket_in_template_parameters? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACKET, this.insert_space_after_opening_bracket? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACE_IN_INITIALIZER_LIST, this.insert_space_after_opening_brace_in_initializer_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CAST, this.insert_space_after_opening_paren_in_cast? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CATCH, this.insert_space_after_opening_paren_in_catch? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_FOR, this.insert_space_after_opening_paren_in_for? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_IF, this.insert_space_after_opening_paren_in_if? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_DECLARATION, this.insert_space_after_opening_paren_in_method_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_EXCEPTION_SPECIFICATION, this.insert_space_after_opening_paren_in_exception_specification? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_INVOCATION, this.insert_space_after_opening_paren_in_method_invocation? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION, this.insert_space_after_opening_paren_in_parenthesized_expression? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_SWITCH, this.insert_space_after_opening_paren_in_switch? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_WHILE, this.insert_space_after_opening_paren_in_while? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_POSTFIX_OPERATOR, this.insert_space_after_postfix_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_PREFIX_OPERATOR, this.insert_space_after_prefix_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_QUESTION_IN_CONDITIONAL, this.insert_space_after_question_in_conditional? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_SEMICOLON_IN_FOR, this.insert_space_after_semicolon_in_for? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_UNARY_OPERATOR, this.insert_space_after_unary_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_ASSIGNMENT_OPERATOR, this.insert_space_before_assignment_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_BINARY_OPERATOR, this.insert_space_before_binary_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS, this.insert_space_before_closing_angle_bracket_in_template_arguments? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS, this.insert_space_before_closing_angle_bracket_in_template_parameters? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACE_IN_INITIALIZER_LIST, this.insert_space_before_closing_brace_in_initializer_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACKET, this.insert_space_before_closing_bracket? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CAST, this.insert_space_before_closing_paren_in_cast? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CATCH, this.insert_space_before_closing_paren_in_catch? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_FOR, this.insert_space_before_closing_paren_in_for? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_IF, this.insert_space_before_closing_paren_in_if? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_DECLARATION, this.insert_space_before_closing_paren_in_method_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_EXCEPTION_SPECIFICATION, this.insert_space_before_closing_paren_in_exception_specification? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_INVOCATION, this.insert_space_before_closing_paren_in_method_invocation? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_PARENTHESIZED_EXPRESSION, this.insert_space_before_closing_paren_in_parenthesized_expression? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_SWITCH, this.insert_space_before_closing_paren_in_switch? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_WHILE, this.insert_space_before_closing_paren_in_while? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_BASE_CLAUSE, this.insert_space_before_colon_in_base_clause? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CASE, this.insert_space_before_colon_in_case? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CONDITIONAL, this.insert_space_before_colon_in_conditional? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_DEFAULT, this.insert_space_before_colon_in_default? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_LABELED_STATEMENT, this.insert_space_before_colon_in_labeled_statement? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ALLOCATION_EXPRESSION, this.insert_space_before_comma_in_allocation_expression? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_INITIALIZER_LIST, this.insert_space_before_comma_in_initializer_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ENUM_DECLARATIONS, this.insert_space_before_comma_in_enum_declarations? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_FOR_INCREMENTS, this.insert_space_before_comma_in_for_increments? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_FOR_INITS, this.insert_space_before_comma_in_for_inits? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_INVOCATION_ARGUMENTS, this.insert_space_before_comma_in_method_invocation_arguments? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_PARAMETERS, this.insert_space_before_comma_in_method_declaration_parameters? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_THROWS, this.insert_space_before_comma_in_method_declaration_throws? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_DECLARATOR_LIST, this.insert_space_before_comma_in_declarator_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_EXPRESSION_LIST, this.insert_space_before_comma_in_expression_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_BASE_TYPES, this.insert_space_before_comma_in_base_types? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TEMPLATE_ARGUMENTS, this.insert_space_before_comma_in_template_arguments ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TEMPLATE_PARAMETERS, this.insert_space_before_comma_in_template_parameters? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_ELLIPSIS, this.insert_space_before_ellipsis ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS, this.insert_space_before_opening_angle_bracket_in_template_arguments? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS, this.insert_space_before_opening_angle_bracket_in_template_parameters? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_INITIALIZER_LIST, this.insert_space_before_opening_brace_in_initializer_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_BLOCK, this.insert_space_before_opening_brace_in_block? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_METHOD_DECLARATION, this.insert_space_before_opening_brace_in_method_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_TYPE_DECLARATION, this.insert_space_before_opening_brace_in_type_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_NAMESPACE_DECLARATION, this.insert_space_before_opening_brace_in_namespace_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACKET, this.insert_space_before_opening_bracket? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_CATCH, this.insert_space_before_opening_paren_in_catch? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_FOR, this.insert_space_before_opening_paren_in_for? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_IF, this.insert_space_before_opening_paren_in_if? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_INVOCATION, this.insert_space_before_opening_paren_in_method_invocation? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_DECLARATION, this.insert_space_before_opening_paren_in_method_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_EXCEPTION_SPECIFICATION, this.insert_space_before_opening_paren_in_exception_specification? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_SWITCH, this.insert_space_before_opening_paren_in_switch? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_SWITCH, this.insert_space_before_opening_brace_in_switch? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION, this.insert_space_before_opening_paren_in_parenthesized_expression? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_WHILE, this.insert_space_before_opening_paren_in_while? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
//		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_PARENTHESIZED_EXPRESSION_IN_RETURN, this.insert_space_before_parenthesized_expression_in_return ? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_POSTFIX_OPERATOR, this.insert_space_before_postfix_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_PREFIX_OPERATOR, this.insert_space_before_prefix_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_QUESTION_IN_CONDITIONAL, this.insert_space_before_question_in_conditional? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON, this.insert_space_before_semicolon? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON_IN_FOR, this.insert_space_before_semicolon_in_for? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_UNARY_OPERATOR, this.insert_space_before_unary_operator? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACES_IN_INITIALIZER_LIST, this.insert_space_between_empty_braces_in_initializer_list? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACKETS, this.insert_space_between_empty_brackets? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_DECLARATION, this.insert_space_between_empty_parens_in_method_declaration? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_INVOCATION, this.insert_space_between_empty_parens_in_method_invocation? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_EXCEPTION_SPECIFICATION, this.insert_space_between_empty_parens_in_exception_specification? IDEPlugin.INSERT : IDEPlugin.DO_NOT_INSERT);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_COMPACT_ELSE_IF, this.compact_else_if ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_GUARDIAN_CLAUSE_ON_ONE_LINE, this.keep_guardian_clause_on_one_line ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_ELSE_STATEMENT_ON_SAME_LINE, this.keep_else_statement_on_same_line ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_EMPTY_INITIALIZER_LIST_ON_ONE_LINE, this.keep_empty_initializer_list_on_one_line ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_SIMPLE_IF_ON_ONE_LINE, this.keep_simple_if_on_one_line ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_THEN_STATEMENT_ON_SAME_LINE, this.keep_then_statement_on_same_line ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_NUMBER_OF_EMPTY_LINES_TO_PRESERVE, Integer.toString(this.number_of_empty_lines_to_preserve));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_JOIN_WRAPPED_LINES, this.join_wrapped_lines ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_PUT_EMPTY_STATEMENT_ON_NEW_LINE, this.put_empty_statement_on_new_line ? STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_LINE_SPLIT, Integer.toString(this.page_width));
		switch (this.tab_char) {
		case SPACE:
			options.put(STPDefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, IDEPlugin.SPACE);
			break;
		case TAB:
			options.put(STPDefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, IDEPlugin.TAB);
			break;
		case MIXED:
			options.put(STPDefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, STPDefaultCodeFormatterConstants.MIXED);
			break;
		}
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_TAB_SIZE, Integer.toString(this.tab_size));
		options.put(STPDefaultCodeFormatterConstants.FORMATTER_USE_TABS_ONLY_FOR_LEADING_INDENTATIONS, this.use_tabs_only_for_leading_indentations ?  STPDefaultCodeFormatterConstants.TRUE : STPDefaultCodeFormatterConstants.FALSE);
		return options;
	}

	public void set(Map<String, String> settings) {
//		final Object alignmentForArgumentsInAllocationExpressionOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_ALLOCATION_EXPRESSION);
//		if (alignmentForArgumentsInAllocationExpressionOption != null) {
//			try {
//				this.alignment_for_arguments_in_allocation_expression = Integer.parseInt((String) alignmentForArgumentsInAllocationExpressionOption);
//			} catch (NumberFormatException e) {
//				this.alignment_for_arguments_in_allocation_expression = Alignment.M_COMPACT_SPLIT;
//			} catch (ClassCastException e) {
//				this.alignment_for_arguments_in_allocation_expression = Alignment.M_COMPACT_SPLIT;
//			}
//		}
		final Object alignmentForArgumentsInMethodInvocationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_METHOD_INVOCATION);
		if (alignmentForArgumentsInMethodInvocationOption != null) {
			try {
				this.alignment_for_arguments_in_method_invocation = Integer.parseInt((String) alignmentForArgumentsInMethodInvocationOption);
			} catch (NumberFormatException e) {
				this.alignment_for_arguments_in_method_invocation = STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_arguments_in_method_invocation = STPAlignment.M_COMPACT_SPLIT;
			}
		}
		final Object alignmentForAssignmentOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ASSIGNMENT);
		if (alignmentForAssignmentOption != null) {
			try {
				this.alignment_for_assignment = Integer.parseInt((String) alignmentForAssignmentOption);
			} catch (NumberFormatException e) {
				this.alignment_for_assignment =  STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_assignment =  STPAlignment.M_COMPACT_SPLIT;
			}
		}
		final Object alignmentForBinaryExpressionOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_BINARY_EXPRESSION);
		if (alignmentForBinaryExpressionOption != null) {
			try {
				this.alignment_for_binary_expression = Integer.parseInt((String) alignmentForBinaryExpressionOption);
			} catch (NumberFormatException e) {
				this.alignment_for_binary_expression =  STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_binary_expression =  STPAlignment.M_COMPACT_SPLIT;
			}
		}
		final Object alignmentForCompactIfOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_COMPACT_IF);
		if (alignmentForCompactIfOption != null) {
			try {
				this.alignment_for_compact_if = Integer.parseInt((String) alignmentForCompactIfOption);
			} catch (NumberFormatException e) {
				this.alignment_for_compact_if = STPAlignment.M_ONE_PER_LINE_SPLIT | STPAlignment.M_INDENT_BY_ONE;
			} catch (ClassCastException e) {
				this.alignment_for_compact_if = STPAlignment.M_ONE_PER_LINE_SPLIT | STPAlignment.M_INDENT_BY_ONE;
			}
		}
		final Object alignmentForConditionalExpressionOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_CONDITIONAL_EXPRESSION);
		if (alignmentForConditionalExpressionOption != null) {
			try {
				this.alignment_for_conditional_expression = Integer.parseInt((String) alignmentForConditionalExpressionOption);
			} catch (NumberFormatException e) {
				this.alignment_for_conditional_expression = STPAlignment.M_COMPACT_FIRST_BREAK_SPLIT | STPAlignment.M_INDENT_ON_COLUMN;
			} catch (ClassCastException e) {
				this.alignment_for_conditional_expression = STPAlignment.M_COMPACT_FIRST_BREAK_SPLIT | STPAlignment.M_INDENT_ON_COLUMN;
			}
		}
		final Object alignmentForConditionalExpressionChainOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_CONDITIONAL_EXPRESSION_CHAIN);
		if (alignmentForConditionalExpressionChainOption != null) {
			try {
				this.alignment_for_conditional_expression_chain = Integer.parseInt((String) alignmentForConditionalExpressionChainOption);
			} catch (NumberFormatException e) {
				this.alignment_for_conditional_expression_chain = STPAlignment.M_COMPACT_SPLIT | STPAlignment.M_INDENT_ON_COLUMN;
			} catch (ClassCastException e) {
				this.alignment_for_conditional_expression_chain = STPAlignment.M_COMPACT_SPLIT | STPAlignment.M_INDENT_ON_COLUMN;
			}
		}
		final Object alignmentForDeclaratorListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_DECLARATOR_LIST);
		if (alignmentForDeclaratorListOption != null) {
			try {
				this.alignment_for_declarator_list = Integer.parseInt((String) alignmentForDeclaratorListOption);
			} catch (NumberFormatException e) {
				this.alignment_for_declarator_list = STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_declarator_list = STPAlignment.M_COMPACT_SPLIT;
			}
		}
		final Object alignmentForEnumeratorListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ENUMERATOR_LIST);
		if (alignmentForEnumeratorListOption != null) {
			try {
				this.alignment_for_enumerator_list = Integer.parseInt((String) alignmentForEnumeratorListOption);
			} catch (NumberFormatException e) {
				this.alignment_for_enumerator_list = STPAlignment.M_ONE_PER_LINE_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_enumerator_list = STPAlignment.M_ONE_PER_LINE_SPLIT;
			}
		}
		final Object alignmentForExpressionsInInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_EXPRESSIONS_IN_INITIALIZER_LIST);
		if (alignmentForExpressionsInInitializerListOption != null) {
			try {
				this.alignment_for_expressions_in_initializer_list = Integer.parseInt((String) alignmentForExpressionsInInitializerListOption);
			} catch (NumberFormatException e) {
				this.alignment_for_expressions_in_initializer_list = STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_expressions_in_initializer_list = STPAlignment.M_COMPACT_SPLIT;
			}
		}
		final Object alignmentForExpressionListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_EXPRESSION_LIST);
		if (alignmentForExpressionListOption != null) {
			try {
				this.alignment_for_expression_list = Integer.parseInt((String) alignmentForExpressionListOption);
			} catch (NumberFormatException e) {
				this.alignment_for_expression_list = STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_expression_list = STPAlignment.M_COMPACT_SPLIT;
			}
		}
		final Object alignmentForMemberAccessOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_MEMBER_ACCESS);
		if (alignmentForMemberAccessOption != null) {
			try {
				this.alignment_for_member_access = Integer.parseInt((String) alignmentForMemberAccessOption);
			} catch (NumberFormatException e) {
				this.alignment_for_member_access =  STPAlignment.M_ONE_PER_LINE_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_member_access =  STPAlignment.M_ONE_PER_LINE_SPLIT;
			}
		}
		final Object alignmentForOverloadedLeftShiftChainOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_OVERLOADED_LEFT_SHIFT_CHAIN);
		if (alignmentForOverloadedLeftShiftChainOption != null) {
			try {
				this.alignment_for_overloaded_left_shift_chain = Integer.parseInt((String) alignmentForOverloadedLeftShiftChainOption);
			} catch (NumberFormatException e) {
				this.alignment_for_overloaded_left_shift_chain = STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_overloaded_left_shift_chain = STPAlignment.M_COMPACT_SPLIT;
			}
		}
		final Object alignmentForParametersInMethodDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_PARAMETERS_IN_METHOD_DECLARATION);
		if (alignmentForParametersInMethodDeclarationOption != null) {
			try {
				this.alignment_for_parameters_in_method_declaration = Integer.parseInt((String) alignmentForParametersInMethodDeclarationOption);
			} catch (NumberFormatException e) {
				this.alignment_for_parameters_in_method_declaration = STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_parameters_in_method_declaration = STPAlignment.M_COMPACT_SPLIT;
			}
		}
		final Object alignmentForBaseClauseInTypeDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_BASE_CLAUSE_IN_TYPE_DECLARATION);
		if (alignmentForBaseClauseInTypeDeclarationOption != null) {
			try {
				this.alignment_for_base_clause_in_type_declaration = Integer.parseInt((String) alignmentForBaseClauseInTypeDeclarationOption);
			} catch (NumberFormatException e) {
				this.alignment_for_base_clause_in_type_declaration = STPAlignment.M_NEXT_SHIFTED_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_base_clause_in_type_declaration = STPAlignment.M_NEXT_SHIFTED_SPLIT;
			}
		}
		final Object alignmentForConstructorInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_CONSTRUCTOR_INITIALIZER_LIST);
		if (alignmentForConstructorInitializerListOption != null) {
			try {
				this.alignment_for_constructor_initializer_list = Integer.parseInt((String) alignmentForConstructorInitializerListOption);
			} catch (NumberFormatException e) {
				this.alignment_for_constructor_initializer_list = STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_constructor_initializer_list = STPAlignment.M_COMPACT_SPLIT;
			}
		}
		final Object alignmentForThrowsClauseInMethodDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_THROWS_CLAUSE_IN_METHOD_DECLARATION);
		if (alignmentForThrowsClauseInMethodDeclarationOption != null) {
			try {
				this.alignment_for_throws_clause_in_method_declaration = Integer.parseInt((String) alignmentForThrowsClauseInMethodDeclarationOption);
			} catch (NumberFormatException e) {
				this.alignment_for_throws_clause_in_method_declaration = STPAlignment.M_COMPACT_SPLIT;
			} catch (ClassCastException e) {
				this.alignment_for_throws_clause_in_method_declaration = STPAlignment.M_COMPACT_SPLIT;
			}
		}
//		final Object alignTypeMembersOnColumnsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_ALIGN_TYPE_MEMBERS_ON_COLUMNS);
//		if (alignTypeMembersOnColumnsOption != null) {
//			this.align_type_members_on_columns = STPDefaultCodeFormatterConstants.TRUE.equals(alignTypeMembersOnColumnsOption);
//		}
//		final Object blankLinesAfterIncludesOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AFTER_IMPORTS);
//		if (blankLinesAfterIncludesOption != null) {
//			try {
//				this.blank_lines_after_includes = Integer.parseInt((String) blankLinesAfterIncludesOption);
//			} catch (NumberFormatException e) {
//				this.blank_lines_after_includes = 0;
//			} catch (ClassCastException e) {
//				this.blank_lines_after_includes = 0;
//			}
//		}
//		final Object blankLinesBeforeFieldOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_FIELD);
//		if (blankLinesBeforeFieldOption != null) {
//			try {
//				this.blank_lines_before_field = Integer.parseInt((String) blankLinesBeforeFieldOption);
//			} catch (NumberFormatException e) {
//				this.blank_lines_before_field = 0;
//			} catch (ClassCastException e) {
//				this.blank_lines_before_field = 0;
//			}
//		}
//		final Object blankLinesBeforeFirstClassBodyDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_FIRST_CLASS_BODY_DECLARATION);
//		if (blankLinesBeforeFirstClassBodyDeclarationOption != null) {
//			try {
//				this.blank_lines_before_first_class_body_declaration = Integer.parseInt((String) blankLinesBeforeFirstClassBodyDeclarationOption);
//			} catch (NumberFormatException e) {
//				this.blank_lines_before_first_class_body_declaration = 0;
//			} catch (ClassCastException e) {
//				this.blank_lines_before_first_class_body_declaration = 0;
//			}
//		}
//		final Object blankLinesBeforeIncludesOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_IMPORTS);
//		if (blankLinesBeforeIncludesOption != null) {
//			try {
//				this.blank_lines_before_includes = Integer.parseInt((String) blankLinesBeforeIncludesOption);
//			} catch (NumberFormatException e) {
//				this.blank_lines_before_includes = 0;
//			} catch (ClassCastException e) {
//				this.blank_lines_before_includes = 0;
//			}
//		}
//		final Object blankLinesBeforeMemberTypeOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_MEMBER_TYPE);
//		if (blankLinesBeforeMemberTypeOption != null) {
//			try {
//				this.blank_lines_before_member_type = Integer.parseInt((String) blankLinesBeforeMemberTypeOption);
//			} catch (NumberFormatException e) {
//				this.blank_lines_before_member_type = 0;
//			} catch (ClassCastException e) {
//				this.blank_lines_before_member_type = 0;
//			}
//		}
//		final Object blankLinesBeforeMethodOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_METHOD);
//		if (blankLinesBeforeMethodOption != null) {
//			try {
//				this.blank_lines_before_method = Integer.parseInt((String) blankLinesBeforeMethodOption);
//			} catch (NumberFormatException e) {
//				this.blank_lines_before_method = 0;
//			} catch (ClassCastException e) {
//				this.blank_lines_before_method = 0;
//			}
//		}
//		final Object blankLinesBeforeNewChunkOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_NEW_CHUNK);
//		if (blankLinesBeforeNewChunkOption != null) {
//			try {
//				this.blank_lines_before_new_chunk = Integer.parseInt((String) blankLinesBeforeNewChunkOption);
//			} catch (NumberFormatException e) {
//				this.blank_lines_before_new_chunk = 0;
//			} catch (ClassCastException e) {
//				this.blank_lines_before_new_chunk = 0;
//			}
//		}
//		final Object blankLinesBetweenTypeDeclarationsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BETWEEN_TYPE_DECLARATIONS);
//		if (blankLinesBetweenTypeDeclarationsOption != null) {
//			try {
//				this.blank_lines_between_type_declarations = Integer.parseInt((String) blankLinesBetweenTypeDeclarationsOption);
//			} catch (NumberFormatException e) {
//				this.blank_lines_between_type_declarations = 0;
//			} catch (ClassCastException e) {
//				this.blank_lines_between_type_declarations = 0;
//			}
//		}
//		final Object blankLinesAtBeginningOfMethodBodyOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_AT_BEGINNING_OF_METHOD_BODY);
//		if (blankLinesAtBeginningOfMethodBodyOption != null) {
//			try {
//				this.blank_lines_at_beginning_of_method_body = Integer.parseInt((String) blankLinesAtBeginningOfMethodBodyOption);
//			} catch (NumberFormatException e) {
//				this.blank_lines_at_beginning_of_method_body = 0;
//			} catch (ClassCastException e) {
//				this.blank_lines_at_beginning_of_method_body = 0;
//			}
//		}
		final Object bracePositionForInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_INITIALIZER_LIST);
		if (bracePositionForInitializerListOption != null) {
			try {
				this.brace_position_for_initializer_list = (String) bracePositionForInitializerListOption;
			} catch (ClassCastException e) {
				this.brace_position_for_initializer_list = STPDefaultCodeFormatterConstants.END_OF_LINE;
			}
		}
		final Object bracePositionForBlockOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_BLOCK);
		if (bracePositionForBlockOption != null) {
			try {
				this.brace_position_for_block = (String) bracePositionForBlockOption;
			} catch (ClassCastException e) {
				this.brace_position_for_block = STPDefaultCodeFormatterConstants.END_OF_LINE;
			}
		}
		final Object bracePositionForBlockInCaseOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_BLOCK_IN_CASE);
		if (bracePositionForBlockInCaseOption != null) {
			try {
				this.brace_position_for_block_in_case = (String) bracePositionForBlockInCaseOption;
			} catch (ClassCastException e) {
				this.brace_position_for_block_in_case = STPDefaultCodeFormatterConstants.END_OF_LINE;
			}
		}
//		final Object bracePositionForEnumDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ENUM_DECLARATION);
//		if (bracePositionForEnumDeclarationOption != null) {
//			try {
//				this.brace_position_for_enum_declaration = (String) bracePositionForEnumDeclarationOption;
//			} catch (ClassCastException e) {
//				this.brace_position_for_enum_declaration = STPDefaultCodeFormatterConstants.END_OF_LINE;
//			}
//		}
		final Object bracePositionForMethodDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_METHOD_DECLARATION);
		if (bracePositionForMethodDeclarationOption != null) {
			try {
				this.brace_position_for_method_declaration = (String) bracePositionForMethodDeclarationOption;
			} catch (ClassCastException e) {
				this.brace_position_for_method_declaration = STPDefaultCodeFormatterConstants.END_OF_LINE;
			}
		}
		final Object bracePositionForSwitchOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_SWITCH);
		if (bracePositionForSwitchOption != null) {
			try {
				this.brace_position_for_switch = (String) bracePositionForSwitchOption;
			} catch (ClassCastException e) {
				this.brace_position_for_switch = STPDefaultCodeFormatterConstants.END_OF_LINE;
			}
		}
		final Object bracePositionForTypeDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION);
		if (bracePositionForTypeDeclarationOption != null) {
			try {
				this.brace_position_for_type_declaration = (String) bracePositionForTypeDeclarationOption;
			} catch (ClassCastException e) {
				this.brace_position_for_type_declaration = STPDefaultCodeFormatterConstants.END_OF_LINE;
			}
		}
		final Object bracePositionForNamespaceDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_NAMESPACE_DECLARATION);
		if (bracePositionForNamespaceDeclarationOption != null) {
			try {
				this.brace_position_for_namespace_declaration = (String) bracePositionForNamespaceDeclarationOption;
			} catch (ClassCastException e) {
				this.brace_position_for_namespace_declaration = STPDefaultCodeFormatterConstants.END_OF_LINE;
			}
		}
//		final Object commentClearBlankLinesOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_CLEAR_BLANK_LINES);
//		if (commentClearBlankLinesOption != null) {
//			this.comment_clear_blank_lines = STPDefaultCodeFormatterConstants.TRUE.equals(commentClearBlankLinesOption);
//		}
//		final Object commentFormatOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT);
//		if (commentFormatOption != null) {
//			this.comment_format = STPDefaultCodeFormatterConstants.TRUE.equals(commentFormatOption);
//		}
//		final Object commentFormatHeaderOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_HEADER);
//		if (commentFormatHeaderOption != null) {
//			this.comment_format_header = STPDefaultCodeFormatterConstants.TRUE.equals(commentFormatHeaderOption);
//		}
//		final Object commentFormatHtmlOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_HTML);
//		if (commentFormatHtmlOption != null) {
//			this.comment_format_html = STPDefaultCodeFormatterConstants.TRUE.equals(commentFormatHtmlOption);
//		}
//		final Object commentFormatSourceOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_SOURCE);
//		if (commentFormatSourceOption != null) {
//			this.comment_format_source = STPDefaultCodeFormatterConstants.TRUE.equals(commentFormatSourceOption);
//		}
//		final Object commentLineLengthOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_LINE_LENGTH);
//		if (commentLineLengthOption != null) {
//			try {
//				this.comment_line_length = Integer.parseInt((String) commentLineLengthOption);
//			} catch (NumberFormatException e) {
//				this.comment_line_length = 80;
//			} catch (ClassCastException e) {
//				this.comment_line_length = 80;
//			}
//		}
		final Object commentMinDistanceBetweenCodeAndLineCommentOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_MIN_DISTANCE_BETWEEN_CODE_AND_LINE_COMMENT);
		if (commentMinDistanceBetweenCodeAndLineCommentOption != null) {
			try {
				this.comment_min_distance_between_code_and_line_comment = Integer.parseInt((String) commentMinDistanceBetweenCodeAndLineCommentOption);
			} catch (NumberFormatException e) {
				this.comment_min_distance_between_code_and_line_comment = 1;
			} catch (ClassCastException e) {
				this.comment_min_distance_between_code_and_line_comment = 1;
			}
		}
		final Object commentPreserveWhiteSpaceBetweenCodeAndLineCommentOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_PRESERVE_WHITE_SPACE_BETWEEN_CODE_AND_LINE_COMMENT);
		if (commentPreserveWhiteSpaceBetweenCodeAndLineCommentOption != null) {
			this.comment_preserve_white_space_between_code_and_line_comment = STPDefaultCodeFormatterConstants.TRUE.equals(commentPreserveWhiteSpaceBetweenCodeAndLineCommentOption);
		}
		final Object neverIndentLineCommentsOnFirstColumn = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMMENT_NEVER_INDENT_LINE_COMMENTS_ON_FIRST_COLUMN);
		if (neverIndentLineCommentsOnFirstColumn != null) {
			this.never_indent_line_comments_on_first_column = STPDefaultCodeFormatterConstants.TRUE.equals(neverIndentLineCommentsOnFirstColumn);
		}
		final Object continuationIndentationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_CONTINUATION_INDENTATION);
		if (continuationIndentationOption != null) {
			try {
				this.continuation_indentation = Integer.parseInt((String) continuationIndentationOption);
			} catch (NumberFormatException e) {
				this.continuation_indentation = 2;
			} catch (ClassCastException e) {
				this.continuation_indentation = 2;
			}
		}
		final Object continuationIndentationForInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_CONTINUATION_INDENTATION_FOR_INITIALIZER_LIST);
		if (continuationIndentationForInitializerListOption != null) {
			try {
				this.continuation_indentation_for_initializer_list = Integer.parseInt((String) continuationIndentationForInitializerListOption);
			} catch (NumberFormatException e) {
				this.continuation_indentation_for_initializer_list = 2;
			} catch (ClassCastException e) {
				this.continuation_indentation_for_initializer_list = 2;
			}
		}
		final Object indentStatementsCompareToBlockOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BLOCK);
		if (indentStatementsCompareToBlockOption != null) {
			this.indent_statements_compare_to_block = STPDefaultCodeFormatterConstants.TRUE.equals(indentStatementsCompareToBlockOption);
		}
		final Object indentStatementsCompareToBodyOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BODY);
		if (indentStatementsCompareToBodyOption != null) {
			this.indent_statements_compare_to_body = STPDefaultCodeFormatterConstants.TRUE.equals(indentStatementsCompareToBodyOption);
		}
		final Object indentAccessSpecifierCompareToTypeHeaderOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_ACCESS_SPECIFIER_COMPARE_TO_TYPE_HEADER);
		if (indentAccessSpecifierCompareToTypeHeaderOption != null) {
			this.indent_access_specifier_compare_to_type_header = STPDefaultCodeFormatterConstants.TRUE.equals(indentAccessSpecifierCompareToTypeHeaderOption);
		}
		final Object indentAccessSpecifierExtraSpaces = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_ACCESS_SPECIFIER_EXTRA_SPACES);
		if (indentAccessSpecifierExtraSpaces != null) {
			try {
				this.indent_access_specifier_extra_spaces = Integer.parseInt((String) indentAccessSpecifierExtraSpaces);
			} catch (NumberFormatException e) {
				this.indent_access_specifier_extra_spaces = 0;
			} catch (ClassCastException e) {
				this.indent_access_specifier_extra_spaces = 0;
			}
		}
		final Object indentBodyDeclarationsCompareToAccessSpecifierOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_ACCESS_SPECIFIER);
		if (indentBodyDeclarationsCompareToAccessSpecifierOption != null) {
			this.indent_body_declarations_compare_to_access_specifier = STPDefaultCodeFormatterConstants.TRUE.equals(indentBodyDeclarationsCompareToAccessSpecifierOption);
		}
		final Object indentDeclarationCompareToTemplateHeaderOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_DECLARATION_COMPARE_TO_TEMPLATE_HEADER);
		if (indentDeclarationCompareToTemplateHeaderOption != null) {
			this.indent_declaration_compare_to_template_header = STPDefaultCodeFormatterConstants.TRUE.equals(indentDeclarationCompareToTemplateHeaderOption);
		}
		final Object indentBodyDeclarationsCompareToNamespaceHeaderOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_NAMESPACE_HEADER);
		if (indentBodyDeclarationsCompareToNamespaceHeaderOption != null) {
			this.indent_body_declarations_compare_to_namespace_header = STPDefaultCodeFormatterConstants.TRUE.equals(indentBodyDeclarationsCompareToNamespaceHeaderOption);
		}
		final Object indentBreaksCompareToCasesOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_BREAKS_COMPARE_TO_CASES);
		if (indentBreaksCompareToCasesOption != null) {
			this.indent_breaks_compare_to_cases = STPDefaultCodeFormatterConstants.TRUE.equals(indentBreaksCompareToCasesOption);
		}
		final Object indentEmptyLinesOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_EMPTY_LINES);
		if (indentEmptyLinesOption != null) {
			this.indent_empty_lines = STPDefaultCodeFormatterConstants.TRUE.equals(indentEmptyLinesOption);
		}
		final Object indentSwitchstatementsCompareToCasesOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_CASES);
		if (indentSwitchstatementsCompareToCasesOption != null) {
			this.indent_switchstatements_compare_to_cases = STPDefaultCodeFormatterConstants.TRUE.equals(indentSwitchstatementsCompareToCasesOption);
		}
		final Object indentSwitchstatementsCompareToSwitchOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_SWITCH);
		if (indentSwitchstatementsCompareToSwitchOption != null) {
			this.indent_switchstatements_compare_to_switch = STPDefaultCodeFormatterConstants.TRUE.equals(indentSwitchstatementsCompareToSwitchOption);
		}
		final Object indentationSizeOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INDENTATION_SIZE);
		if (indentationSizeOption != null) {
			try {
				this.indentation_size = Integer.parseInt((String) indentationSizeOption);
			} catch (NumberFormatException e) {
				this.indentation_size = 4;
			} catch (ClassCastException e) {
				this.indentation_size = 4;
			}
		}
		final Object insertNewLineAfterOpeningBraceInInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AFTER_OPENING_BRACE_IN_INITIALIZER_LIST);
		if (insertNewLineAfterOpeningBraceInInitializerListOption != null) {
			this.insert_new_line_after_opening_brace_in_initializer_list = IDEPlugin.INSERT.equals(insertNewLineAfterOpeningBraceInInitializerListOption);
		}
		final Object insertNewLineAfterTemplateDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AFTER_TEMPLATE_DECLARATION);
		if (insertNewLineAfterOpeningBraceInInitializerListOption != null) {
			this.insert_new_line_after_template_declaration = IDEPlugin.INSERT.equals(insertNewLineAfterTemplateDeclarationOption);
		}
		final Object insertNewLineAtEndOfFileIfMissingOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_AT_END_OF_FILE_IF_MISSING);
		if (insertNewLineAtEndOfFileIfMissingOption != null) {
			this.insert_new_line_at_end_of_file_if_missing = IDEPlugin.INSERT.equals(insertNewLineAtEndOfFileIfMissingOption);
		}
		final Object insertNewLineBeforeCatchInTryStatementOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_CATCH_IN_TRY_STATEMENT);
		if (insertNewLineBeforeCatchInTryStatementOption != null) {
			this.insert_new_line_before_catch_in_try_statement = IDEPlugin.INSERT.equals(insertNewLineBeforeCatchInTryStatementOption);
		}
		final Object insertNewLineBeforeClosingBraceInInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_CLOSING_BRACE_IN_INITIALIZER_LIST);
		if (insertNewLineBeforeClosingBraceInInitializerListOption != null) {
			this.insert_new_line_before_closing_brace_in_initializer_list = IDEPlugin.INSERT.equals(insertNewLineBeforeClosingBraceInInitializerListOption);
		}
		final Object insertNewLineBeforeColonInConstructorInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_COLON_IN_CONSTRUCTOR_INITIALIZER_LIST);
		if (insertNewLineBeforeColonInConstructorInitializerListOption != null) {
			this.insert_new_line_before_colon_in_constructor_initializer_list = IDEPlugin.INSERT.equals(insertNewLineBeforeColonInConstructorInitializerListOption);
		}
		final Object insertNewLineBeforeElseInIfStatementOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_ELSE_IN_IF_STATEMENT);
		if (insertNewLineBeforeElseInIfStatementOption != null) {
			this.insert_new_line_before_else_in_if_statement = IDEPlugin.INSERT.equals(insertNewLineBeforeElseInIfStatementOption);
		}
		final Object insertNewLineBeforeWhileInDoStatementOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_WHILE_IN_DO_STATEMENT);
		if (insertNewLineBeforeWhileInDoStatementOption != null) {
			this.insert_new_line_before_while_in_do_statement = IDEPlugin.INSERT.equals(insertNewLineBeforeWhileInDoStatementOption);
		}
		final Object insertNewLineBeforeIdentifierInFunctionDefinitionOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_BEFORE_IDENTIFIER_IN_FUNCTION_DECLARATION);
		if (insertNewLineBeforeWhileInDoStatementOption != null) {
			this.insert_new_line_before_identifier_in_function_declaration = IDEPlugin.INSERT.equals(insertNewLineBeforeIdentifierInFunctionDefinitionOption);
		}
		final Object insertNewLineInEmptyBlockOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_BLOCK);
		if (insertNewLineInEmptyBlockOption != null) {
			this.insert_new_line_in_empty_block = IDEPlugin.INSERT.equals(insertNewLineInEmptyBlockOption);
		}
//		final Object insertNewLineInEmptyMethodBodyOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_METHOD_BODY);
//		if (insertNewLineInEmptyMethodBodyOption != null) {
//			this.insert_new_line_in_empty_method_body = IDEPlugin.INSERT.equals(insertNewLineInEmptyMethodBodyOption);
//		}
//		final Object insertNewLineInEmptyTypeDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_NEW_LINE_IN_EMPTY_TYPE_DECLARATION);
//		if (insertNewLineInEmptyTypeDeclarationOption != null) {
//			this.insert_new_line_in_empty_type_declaration = IDEPlugin.INSERT.equals(insertNewLineInEmptyTypeDeclarationOption);
//		}
		final Object insertSpaceAfterAssignmentOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_ASSIGNMENT_OPERATOR);
		if (insertSpaceAfterAssignmentOperatorOption != null) {
			this.insert_space_after_assignment_operator = IDEPlugin.INSERT.equals(insertSpaceAfterAssignmentOperatorOption);
		}
		final Object insertSpaceAfterBinaryOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_BINARY_OPERATOR);
		if (insertSpaceAfterBinaryOperatorOption != null) {
			this.insert_space_after_binary_operator = IDEPlugin.INSERT.equals(insertSpaceAfterBinaryOperatorOption);
		}
		final Object insertSpaceAfterClosingAngleBracketInTemplateArgumentsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS);
		if (insertSpaceAfterClosingAngleBracketInTemplateArgumentsOption != null) {
			this.insert_space_after_closing_angle_bracket_in_template_arguments = IDEPlugin.INSERT.equals(insertSpaceAfterClosingAngleBracketInTemplateArgumentsOption);
		}
		final Object insertSpaceAfterClosingAngleBracketInTemplateParametersOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS);
		if (insertSpaceAfterClosingAngleBracketInTemplateParametersOption != null) {
			this.insert_space_after_closing_angle_bracket_in_template_parameters = IDEPlugin.INSERT.equals(insertSpaceAfterClosingAngleBracketInTemplateParametersOption);
		}
		final Object insertSpaceAfterClosingParenInCastOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_PAREN_IN_CAST);
		if (insertSpaceAfterClosingParenInCastOption != null) {
			this.insert_space_after_closing_paren_in_cast = IDEPlugin.INSERT.equals(insertSpaceAfterClosingParenInCastOption);
		}
		final Object insertSpaceAfterClosingBraceInBlockOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_CLOSING_BRACE_IN_BLOCK);
		if (insertSpaceAfterClosingBraceInBlockOption != null) {
			this.insert_space_after_closing_brace_in_block = IDEPlugin.INSERT.equals(insertSpaceAfterClosingBraceInBlockOption);
		}
		final Object insertSpaceAfterColonInBaseClauseOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_BASE_CLAUSE);
		if (insertSpaceAfterColonInBaseClauseOption != null) {
			this.insert_space_after_colon_in_base_clause = IDEPlugin.INSERT.equals(insertSpaceAfterColonInBaseClauseOption);
		}
		final Object insertSpaceAfterColonInCaseOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CASE);
		if (insertSpaceAfterColonInCaseOption != null) {
			this.insert_space_after_colon_in_case = IDEPlugin.INSERT.equals(insertSpaceAfterColonInCaseOption);
		}
		final Object insertSpaceAfterColonInConditionalOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CONDITIONAL);
		if (insertSpaceAfterColonInConditionalOption != null) {
			this.insert_space_after_colon_in_conditional = IDEPlugin.INSERT.equals(insertSpaceAfterColonInConditionalOption);
		}
		final Object insertSpaceAfterColonInLabeledStatementOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COLON_IN_LABELED_STATEMENT);
		if (insertSpaceAfterColonInLabeledStatementOption != null) {
			this.insert_space_after_colon_in_labeled_statement = IDEPlugin.INSERT.equals(insertSpaceAfterColonInLabeledStatementOption);
		}
//		final Object insertSpaceAfterCommaInAllocationExpressionOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ALLOCATION_EXPRESSION);
//		if (insertSpaceAfterCommaInAllocationExpressionOption != null) {
//			this.insert_space_after_comma_in_allocation_expression = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInAllocationExpressionOption);
//		}
		final Object insertSpaceAfterCommaInInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_INITIALIZER_LIST);
		if (insertSpaceAfterCommaInInitializerListOption != null) {
			this.insert_space_after_comma_in_initializer_list = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInInitializerListOption);
		}
		final Object insertSpaceAfterCommaInEnumDeclarationsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ENUM_DECLARATIONS);
		if (insertSpaceAfterCommaInEnumDeclarationsOption != null) {
			this.insert_space_after_comma_in_enum_declarations = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInEnumDeclarationsOption);
		}
//		final Object insertSpaceAfterCommaInForInitsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_FOR_INITS);
//		if (insertSpaceAfterCommaInForInitsOption != null) {
//			this.insert_space_after_comma_in_for_inits = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInForInitsOption);
//		}
//		final Object insertSpaceAfterCommaInForIncrementsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_FOR_INCREMENTS);
//		if (insertSpaceAfterCommaInForIncrementsOption != null) {
//			this.insert_space_after_comma_in_for_increments = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInForIncrementsOption);
//		}
		final Object insertSpaceAfterCommaInMethodInvocationArgumentsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_INVOCATION_ARGUMENTS);
		if (insertSpaceAfterCommaInMethodInvocationArgumentsOption != null) {
			this.insert_space_after_comma_in_method_invocation_arguments = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInMethodInvocationArgumentsOption);
		}
		final Object insertSpaceAfterCommaInMethodDeclarationParametersOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_PARAMETERS);
		if (insertSpaceAfterCommaInMethodDeclarationParametersOption != null) {
			this.insert_space_after_comma_in_method_declaration_parameters = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInMethodDeclarationParametersOption);
		}
		final Object insertSpaceAfterCommaInMethodDeclarationThrowsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_THROWS);
		if (insertSpaceAfterCommaInMethodDeclarationThrowsOption != null) {
			this.insert_space_after_comma_in_method_declaration_throws = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInMethodDeclarationThrowsOption);
		}
		final Object insertSpaceAfterCommaInMultipleFieldDeclarationsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_DECLARATOR_LIST);
		if (insertSpaceAfterCommaInMultipleFieldDeclarationsOption != null) {
			this.insert_space_after_comma_in_declarator_list = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInMultipleFieldDeclarationsOption);
		}
		final Object insertSpaceAfterCommaInExpressionListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_EXPRESSION_LIST);
		if (insertSpaceAfterCommaInExpressionListOption != null) {
			this.insert_space_after_comma_in_expression_list = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInExpressionListOption);
		}
		final Object insertSpaceAfterCommaInBaseTypesOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_BASE_TYPES);
		if (insertSpaceAfterCommaInBaseTypesOption != null) {
			this.insert_space_after_comma_in_base_types = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInBaseTypesOption);
		}
		final Object insertSpaceAfterCommaInTemplateArgumentsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TEMPLATE_ARGUMENTS);
		if (insertSpaceAfterCommaInTemplateArgumentsOption != null) {
			this.insert_space_after_comma_in_template_arguments = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInTemplateArgumentsOption);
		}
		final Object insertSpaceAfterCommaInTemplateParametersOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TEMPLATE_PARAMETERS);
		if (insertSpaceAfterCommaInTemplateParametersOption != null) {
			this.insert_space_after_comma_in_template_parameters = IDEPlugin.INSERT.equals(insertSpaceAfterCommaInTemplateParametersOption);
		}
//		final Object insertSpaceAfterEllipsisOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_ELLIPSIS);
//		if (insertSpaceAfterEllipsisOption != null) {
//			this.insert_space_after_ellipsis = IDEPlugin.INSERT.equals(insertSpaceAfterEllipsisOption);
//		}
//		final Object insertSpaceAfterOpeningAngleBracketInParameterizedTypeReferenceOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_PARAMETERIZED_TYPE_REFERENCE);
//		if (insertSpaceAfterOpeningAngleBracketInParameterizedTypeReferenceOption != null) {
//			this.insert_space_after_opening_angle_bracket_in_parameterized_type_reference = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningAngleBracketInParameterizedTypeReferenceOption);
//		}
		final Object insertSpaceAfterOpeningAngleBracketInTemplateArgumentsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS);
		if (insertSpaceAfterOpeningAngleBracketInTemplateArgumentsOption != null) {
			this.insert_space_after_opening_angle_bracket_in_template_arguments = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningAngleBracketInTemplateArgumentsOption);
		}
		final Object insertSpaceAfterOpeningAngleBracketInTemplateParametersOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS);
		if (insertSpaceAfterOpeningAngleBracketInTemplateParametersOption != null) {
			this.insert_space_after_opening_angle_bracket_in_template_parameters = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningAngleBracketInTemplateParametersOption);
		}
		final Object insertSpaceAfterOpeningBracketInArrayReferenceOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACKET);
		if (insertSpaceAfterOpeningBracketInArrayReferenceOption != null) {
			this.insert_space_after_opening_bracket = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningBracketInArrayReferenceOption);
		}
		final Object insertSpaceAfterOpeningBraceInInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACE_IN_INITIALIZER_LIST);
		if (insertSpaceAfterOpeningBraceInInitializerListOption != null) {
			this.insert_space_after_opening_brace_in_initializer_list = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningBraceInInitializerListOption);
		}
		final Object insertSpaceAfterOpeningParenInCastOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CAST);
		if (insertSpaceAfterOpeningParenInCastOption != null) {
			this.insert_space_after_opening_paren_in_cast = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInCastOption);
		}
		final Object insertSpaceAfterOpeningParenInCatchOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CATCH);
		if (insertSpaceAfterOpeningParenInCatchOption != null) {
			this.insert_space_after_opening_paren_in_catch = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInCatchOption);
		}
		final Object insertSpaceAfterOpeningParenInForOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_FOR);
		if (insertSpaceAfterOpeningParenInForOption != null) {
			this.insert_space_after_opening_paren_in_for = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInForOption);
		}
		final Object insertSpaceAfterOpeningParenInIfOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_IF);
		if (insertSpaceAfterOpeningParenInIfOption != null) {
			this.insert_space_after_opening_paren_in_if = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInIfOption);
		}
		final Object insertSpaceAfterOpeningParenInMethodDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_DECLARATION);
		if (insertSpaceAfterOpeningParenInMethodDeclarationOption != null) {
			this.insert_space_after_opening_paren_in_method_declaration = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInMethodDeclarationOption);
		}
		final Object insertSpaceAfterOpeningParenInExceptionSpecificationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_EXCEPTION_SPECIFICATION);
		if (insertSpaceAfterOpeningParenInExceptionSpecificationOption != null) {
			this.insert_space_after_opening_paren_in_exception_specification = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInExceptionSpecificationOption);
		}
		final Object insertSpaceAfterOpeningParenInMethodInvocationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_INVOCATION);
		if (insertSpaceAfterOpeningParenInMethodInvocationOption != null) {
			this.insert_space_after_opening_paren_in_method_invocation = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInMethodInvocationOption);
		}
		final Object insertSpaceAfterOpeningParenInParenthesizedExpressionOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION);
		if (insertSpaceAfterOpeningParenInParenthesizedExpressionOption != null) {
			this.insert_space_after_opening_paren_in_parenthesized_expression = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInParenthesizedExpressionOption);
		}
		final Object insertSpaceAfterOpeningParenInSwitchOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_SWITCH);
		if (insertSpaceAfterOpeningParenInSwitchOption != null) {
			this.insert_space_after_opening_paren_in_switch = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInSwitchOption);
		}
		final Object insertSpaceAfterOpeningParenInWhileOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_WHILE);
		if (insertSpaceAfterOpeningParenInWhileOption != null) {
			this.insert_space_after_opening_paren_in_while = IDEPlugin.INSERT.equals(insertSpaceAfterOpeningParenInWhileOption);
		}
		final Object insertSpaceAfterPostfixOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_POSTFIX_OPERATOR);
		if (insertSpaceAfterPostfixOperatorOption != null) {
			this.insert_space_after_postfix_operator = IDEPlugin.INSERT.equals(insertSpaceAfterPostfixOperatorOption);
		}
		final Object insertSpaceAfterPrefixOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_PREFIX_OPERATOR);
		if (insertSpaceAfterPrefixOperatorOption != null) {
			this.insert_space_after_prefix_operator = IDEPlugin.INSERT.equals(insertSpaceAfterPrefixOperatorOption);
		}
		final Object insertSpaceAfterQuestionInConditionalOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_QUESTION_IN_CONDITIONAL);
		if (insertSpaceAfterQuestionInConditionalOption != null) {
			this.insert_space_after_question_in_conditional = IDEPlugin.INSERT.equals(insertSpaceAfterQuestionInConditionalOption);
		}
		final Object insertSpaceAfterSemicolonInForOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_SEMICOLON_IN_FOR);
		if (insertSpaceAfterSemicolonInForOption != null) {
			this.insert_space_after_semicolon_in_for = IDEPlugin.INSERT.equals(insertSpaceAfterSemicolonInForOption);
		}
		final Object insertSpaceAfterUnaryOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_AFTER_UNARY_OPERATOR);
		if (insertSpaceAfterUnaryOperatorOption != null) {
			this.insert_space_after_unary_operator = IDEPlugin.INSERT.equals(insertSpaceAfterUnaryOperatorOption);
		}
		final Object insertSpaceBeforeAssignmentOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_ASSIGNMENT_OPERATOR);
		if (insertSpaceBeforeAssignmentOperatorOption != null) {
			this.insert_space_before_assignment_operator = IDEPlugin.INSERT.equals(insertSpaceBeforeAssignmentOperatorOption);
		}
		final Object insertSpaceBeforeBinaryOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_BINARY_OPERATOR);
		if (insertSpaceBeforeBinaryOperatorOption != null) {
			this.insert_space_before_binary_operator = IDEPlugin.INSERT.equals(insertSpaceBeforeBinaryOperatorOption);
		}
		final Object insertSpaceBeforeClosingAngleBracketInTemplateArgumentsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS);
		if (insertSpaceBeforeClosingAngleBracketInTemplateArgumentsOption != null) {
			this.insert_space_before_closing_angle_bracket_in_template_arguments = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingAngleBracketInTemplateArgumentsOption);
		}
		final Object insertSpaceBeforeClosingAngleBracketInTemplateParametersOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS);
		if (insertSpaceBeforeClosingAngleBracketInTemplateParametersOption != null) {
			this.insert_space_before_closing_angle_bracket_in_template_parameters = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingAngleBracketInTemplateParametersOption);
		}
		final Object insertSpaceBeforeClosingBraceInInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACE_IN_INITIALIZER_LIST);
		if (insertSpaceBeforeClosingBraceInInitializerListOption != null) {
			this.insert_space_before_closing_brace_in_initializer_list = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingBraceInInitializerListOption);
		}
		final Object insertSpaceBeforeClosingBracketInArrayReferenceOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACKET);
		if (insertSpaceBeforeClosingBracketInArrayReferenceOption != null) {
			this.insert_space_before_closing_bracket = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingBracketInArrayReferenceOption);
		}
		final Object insertSpaceBeforeClosingParenInCastOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CAST);
		if (insertSpaceBeforeClosingParenInCastOption != null) {
			this.insert_space_before_closing_paren_in_cast = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInCastOption);
		}
		final Object insertSpaceBeforeClosingParenInCatchOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CATCH);
		if (insertSpaceBeforeClosingParenInCatchOption != null) {
			this.insert_space_before_closing_paren_in_catch = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInCatchOption);
		}
		final Object insertSpaceBeforeClosingParenInForOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_FOR);
		if (insertSpaceBeforeClosingParenInForOption != null) {
			this.insert_space_before_closing_paren_in_for = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInForOption);
		}
		final Object insertSpaceBeforeClosingParenInIfOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_IF);
		if (insertSpaceBeforeClosingParenInIfOption != null) {
			this.insert_space_before_closing_paren_in_if = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInIfOption);
		}
		final Object insertSpaceBeforeClosingParenInMethodDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_DECLARATION);
		if (insertSpaceBeforeClosingParenInMethodDeclarationOption != null) {
			this.insert_space_before_closing_paren_in_method_declaration = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInMethodDeclarationOption);
		}
		final Object insertSpaceBeforeClosingParenInExceptionSpecificationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_EXCEPTION_SPECIFICATION);
		if (insertSpaceBeforeClosingParenInExceptionSpecificationOption != null) {
			this.insert_space_before_closing_paren_in_exception_specification = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInExceptionSpecificationOption);
		}
		final Object insertSpaceBeforeClosingParenInMethodInvocationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_INVOCATION);
		if (insertSpaceBeforeClosingParenInMethodInvocationOption != null) {
			this.insert_space_before_closing_paren_in_method_invocation = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInMethodInvocationOption);
		}
		final Object insertSpaceBeforeClosingParenInParenthesizedExpressionOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_PARENTHESIZED_EXPRESSION);
		if (insertSpaceBeforeClosingParenInParenthesizedExpressionOption != null) {
			this.insert_space_before_closing_paren_in_parenthesized_expression = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInParenthesizedExpressionOption);
		}
		final Object insertSpaceBeforeClosingParenInSwitchOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_SWITCH);
		if (insertSpaceBeforeClosingParenInSwitchOption != null) {
			this.insert_space_before_closing_paren_in_switch = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInSwitchOption);
		}
		final Object insertSpaceBeforeClosingParenInWhileOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_WHILE);
		if (insertSpaceBeforeClosingParenInWhileOption != null) {
			this.insert_space_before_closing_paren_in_while = IDEPlugin.INSERT.equals(insertSpaceBeforeClosingParenInWhileOption);
		}
		final Object insertSpaceBeforeColonInCaseOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CASE);
		final Object insertSpaceBeforeColonInBaseClauseOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_BASE_CLAUSE);
		if (insertSpaceBeforeColonInBaseClauseOption != null) {
			this.insert_space_before_colon_in_base_clause = IDEPlugin.INSERT.equals(insertSpaceBeforeColonInBaseClauseOption);
		}
		if (insertSpaceBeforeColonInCaseOption != null) {
			this.insert_space_before_colon_in_case = IDEPlugin.INSERT.equals(insertSpaceBeforeColonInCaseOption);
		}
		final Object insertSpaceBeforeColonInConditionalOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CONDITIONAL);
		if (insertSpaceBeforeColonInConditionalOption != null) {
			this.insert_space_before_colon_in_conditional = IDEPlugin.INSERT.equals(insertSpaceBeforeColonInConditionalOption);
		}
		final Object insertSpaceBeforeColonInDefaultOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_DEFAULT);
		if (insertSpaceBeforeColonInDefaultOption != null) {
			this.insert_space_before_colon_in_default = IDEPlugin.INSERT.equals(insertSpaceBeforeColonInDefaultOption);
		}
		final Object insertSpaceBeforeColonInLabeledStatementOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_LABELED_STATEMENT);
		if (insertSpaceBeforeColonInLabeledStatementOption != null) {
			this.insert_space_before_colon_in_labeled_statement = IDEPlugin.INSERT.equals(insertSpaceBeforeColonInLabeledStatementOption);
		}
//		final Object insertSpaceBeforeCommaInAllocationExpressionOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ALLOCATION_EXPRESSION);
//		if (insertSpaceBeforeCommaInAllocationExpressionOption != null) {
//			this.insert_space_before_comma_in_allocation_expression = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInAllocationExpressionOption);
//		}
		final Object insertSpaceBeforeCommaInInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_INITIALIZER_LIST);
		if (insertSpaceBeforeCommaInInitializerListOption != null) {
			this.insert_space_before_comma_in_initializer_list = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInInitializerListOption);
		}
		final Object insertSpaceBeforeCommaInEnumDeclarationsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ENUM_DECLARATIONS);
		if (insertSpaceBeforeCommaInEnumDeclarationsOption != null) {
			this.insert_space_before_comma_in_enum_declarations = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInEnumDeclarationsOption);
		}
//		final Object insertSpaceBeforeCommaInForInitsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_FOR_INITS);
//		if (insertSpaceBeforeCommaInForInitsOption != null) {
//			this.insert_space_before_comma_in_for_inits = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInForInitsOption);
//		}
//		final Object insertSpaceBeforeCommaInForIncrementsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_FOR_INCREMENTS);
//		if (insertSpaceBeforeCommaInForIncrementsOption != null) {
//			this.insert_space_before_comma_in_for_increments = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInForIncrementsOption);
//		}
		final Object insertSpaceBeforeCommaInMethodInvocationArgumentsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_INVOCATION_ARGUMENTS);
		if (insertSpaceBeforeCommaInMethodInvocationArgumentsOption != null) {
			this.insert_space_before_comma_in_method_invocation_arguments = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInMethodInvocationArgumentsOption);
		}
		final Object insertSpaceBeforeCommaInMethodDeclarationParametersOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_PARAMETERS);
		if (insertSpaceBeforeCommaInMethodDeclarationParametersOption != null) {
			this.insert_space_before_comma_in_method_declaration_parameters = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInMethodDeclarationParametersOption);
		}
		final Object insertSpaceBeforeCommaInMethodDeclarationThrowsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_THROWS);
		if (insertSpaceBeforeCommaInMethodDeclarationThrowsOption != null) {
			this.insert_space_before_comma_in_method_declaration_throws = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInMethodDeclarationThrowsOption);
		}
		final Object insertSpaceBeforeCommaInMultipleFieldDeclarationsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_DECLARATOR_LIST);
		if (insertSpaceBeforeCommaInMultipleFieldDeclarationsOption != null) {
			this.insert_space_before_comma_in_declarator_list = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInMultipleFieldDeclarationsOption);
		}
		final Object insertSpaceBeforeCommaInMultipleLocalDeclarationsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_EXPRESSION_LIST);
		if (insertSpaceBeforeCommaInMultipleLocalDeclarationsOption != null) {
			this.insert_space_before_comma_in_expression_list = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInMultipleLocalDeclarationsOption);
		}
		final Object insertSpaceBeforeCommaInBaseTypesOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_BASE_TYPES);
		if (insertSpaceBeforeCommaInBaseTypesOption != null) {
			this.insert_space_before_comma_in_base_types = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInBaseTypesOption);
		}
		final Object insertSpaceBeforeCommaInTemplateArgumentsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TEMPLATE_ARGUMENTS);
		if (insertSpaceBeforeCommaInTemplateArgumentsOption != null) {
			this.insert_space_before_comma_in_template_arguments = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInTemplateArgumentsOption);
		}
		final Object insertSpaceBeforeCommaInTemplateParametersOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TEMPLATE_PARAMETERS);
		if (insertSpaceBeforeCommaInTemplateParametersOption != null) {
			this.insert_space_before_comma_in_template_parameters = IDEPlugin.INSERT.equals(insertSpaceBeforeCommaInTemplateParametersOption);
		}
//		final Object insertSpaceBeforeEllipsisOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_ELLIPSIS);
//		if (insertSpaceBeforeEllipsisOption != null) {
//			this.insert_space_before_ellipsis = IDEPlugin.INSERT.equals(insertSpaceBeforeEllipsisOption);
//		}
		final Object insertSpaceBeforeOpeningAngleBrackerInTemplateArgumentsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS);
		if (insertSpaceBeforeOpeningAngleBrackerInTemplateArgumentsOption != null) {
			this.insert_space_before_opening_angle_bracket_in_template_arguments = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningAngleBrackerInTemplateArgumentsOption);
		}
		final Object insertSpaceBeforeOpeningAngleBrackerInTemplateParametersOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS);
		if (insertSpaceBeforeOpeningAngleBrackerInTemplateParametersOption != null) {
			this.insert_space_before_opening_angle_bracket_in_template_parameters = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningAngleBrackerInTemplateParametersOption);
		}
		final Object insertSpaceBeforeOpeningBraceInInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_INITIALIZER_LIST);
		if (insertSpaceBeforeOpeningBraceInInitializerListOption != null) {
			this.insert_space_before_opening_brace_in_initializer_list = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningBraceInInitializerListOption);
		}
		final Object insertSpaceBeforeOpeningBraceInBlockOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_BLOCK);
		if (insertSpaceBeforeOpeningBraceInBlockOption != null) {
			this.insert_space_before_opening_brace_in_block = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningBraceInBlockOption);
		}
		final Object insertSpaceBeforeOpeningBraceInMethodDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_METHOD_DECLARATION);
		if (insertSpaceBeforeOpeningBraceInMethodDeclarationOption != null) {
			this.insert_space_before_opening_brace_in_method_declaration = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningBraceInMethodDeclarationOption);
		}
		final Object insertSpaceBeforeOpeningBraceInTypeDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_TYPE_DECLARATION);
		if (insertSpaceBeforeOpeningBraceInTypeDeclarationOption != null) {
			this.insert_space_before_opening_brace_in_type_declaration = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningBraceInTypeDeclarationOption);
		}
		final Object insertSpaceBeforeOpeningBraceInNamespaceDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_NAMESPACE_DECLARATION);
		if (insertSpaceBeforeOpeningBraceInNamespaceDeclarationOption != null) {
			this.insert_space_before_opening_brace_in_namespace_declaration = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningBraceInNamespaceDeclarationOption);
		}
		final Object insertSpaceBeforeOpeningBracketInArrayReferenceOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACKET);
		if (insertSpaceBeforeOpeningBracketInArrayReferenceOption != null) {
			this.insert_space_before_opening_bracket = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningBracketInArrayReferenceOption);
		}
		final Object insertSpaceBeforeOpeningParenInCatchOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_CATCH);
		if (insertSpaceBeforeOpeningParenInCatchOption != null) {
			this.insert_space_before_opening_paren_in_catch = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningParenInCatchOption);
		}
		final Object insertSpaceBeforeOpeningParenInForOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_FOR);
		if (insertSpaceBeforeOpeningParenInForOption != null) {
			this.insert_space_before_opening_paren_in_for = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningParenInForOption);
		}
		final Object insertSpaceBeforeOpeningParenInIfOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_IF);
		if (insertSpaceBeforeOpeningParenInIfOption != null) {
			this.insert_space_before_opening_paren_in_if = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningParenInIfOption);
		}
		final Object insertSpaceBeforeOpeningParenInMethodInvocationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_INVOCATION);
		if (insertSpaceBeforeOpeningParenInMethodInvocationOption != null) {
			this.insert_space_before_opening_paren_in_method_invocation = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningParenInMethodInvocationOption);
		}
		final Object insertSpaceBeforeOpeningParenInMethodDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_DECLARATION);
		if (insertSpaceBeforeOpeningParenInMethodDeclarationOption != null) {
			this.insert_space_before_opening_paren_in_method_declaration = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningParenInMethodDeclarationOption);
		}
		final Object insertSpaceBeforeOpeningParenInExceptionSpecificationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_EXCEPTION_SPECIFICATION);
		if (insertSpaceBeforeOpeningParenInExceptionSpecificationOption != null) {
			this.insert_space_before_opening_paren_in_exception_specification = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningParenInExceptionSpecificationOption);
		}
		final Object insertSpaceBeforeOpeningParenInSwitchOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_SWITCH);
		if (insertSpaceBeforeOpeningParenInSwitchOption != null) {
			this.insert_space_before_opening_paren_in_switch = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningParenInSwitchOption);
		}
		final Object insertSpaceBeforeOpeningBraceInSwitchOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_SWITCH);
		if (insertSpaceBeforeOpeningBraceInSwitchOption != null) {
			this.insert_space_before_opening_brace_in_switch = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningBraceInSwitchOption);
		}
		final Object insertSpaceBeforeOpeningParenInParenthesizedExpressionOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION);
		if (insertSpaceBeforeOpeningParenInParenthesizedExpressionOption != null) {
			this.insert_space_before_opening_paren_in_parenthesized_expression = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningParenInParenthesizedExpressionOption);
		}
		final Object insertSpaceBeforeOpeningParenInWhileOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_WHILE);
		if (insertSpaceBeforeOpeningParenInWhileOption != null) {
			this.insert_space_before_opening_paren_in_while = IDEPlugin.INSERT.equals(insertSpaceBeforeOpeningParenInWhileOption);
		}
//		final Object insertSpaceBeforeParenthesizedExpressionInReturnOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_PARENTHESIZED_EXPRESSION_IN_RETURN);
//		if (insertSpaceBeforeParenthesizedExpressionInReturnOption != null) {
//			this.insert_space_before_parenthesized_expression_in_return = IDEPlugin.INSERT.equals(insertSpaceBeforeParenthesizedExpressionInReturnOption);
//		}
		final Object insertSpaceBeforePostfixOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_POSTFIX_OPERATOR);
		if (insertSpaceBeforePostfixOperatorOption != null) {
			this.insert_space_before_postfix_operator = IDEPlugin.INSERT.equals(insertSpaceBeforePostfixOperatorOption);
		}
		final Object insertSpaceBeforePrefixOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_PREFIX_OPERATOR);
		if (insertSpaceBeforePrefixOperatorOption != null) {
			this.insert_space_before_prefix_operator = IDEPlugin.INSERT.equals(insertSpaceBeforePrefixOperatorOption);
		}
		final Object insertSpaceBeforeQuestionInConditionalOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_QUESTION_IN_CONDITIONAL);
		if (insertSpaceBeforeQuestionInConditionalOption != null) {
			this.insert_space_before_question_in_conditional = IDEPlugin.INSERT.equals(insertSpaceBeforeQuestionInConditionalOption);
		}
		final Object insertSpaceBeforeSemicolonOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON);
		if (insertSpaceBeforeSemicolonOption != null) {
			this.insert_space_before_semicolon = IDEPlugin.INSERT.equals(insertSpaceBeforeSemicolonOption);
		}
		final Object insertSpaceBeforeSemicolonInForOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON_IN_FOR);
		if (insertSpaceBeforeSemicolonInForOption != null) {
			this.insert_space_before_semicolon_in_for = IDEPlugin.INSERT.equals(insertSpaceBeforeSemicolonInForOption);
		}
		final Object insertSpaceBeforeUnaryOperatorOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BEFORE_UNARY_OPERATOR);
		if (insertSpaceBeforeUnaryOperatorOption != null) {
			this.insert_space_before_unary_operator = IDEPlugin.INSERT.equals(insertSpaceBeforeUnaryOperatorOption);
		}
		final Object insertSpaceBetweenEmptyBracesInInitializerListOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACES_IN_INITIALIZER_LIST);
		if (insertSpaceBetweenEmptyBracesInInitializerListOption != null) {
			this.insert_space_between_empty_braces_in_initializer_list = IDEPlugin.INSERT.equals(insertSpaceBetweenEmptyBracesInInitializerListOption);
		}
		final Object insertSpaceBetweenEmptyBracketsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACKETS);
		if (insertSpaceBetweenEmptyBracketsOption != null) {
			this.insert_space_between_empty_brackets = IDEPlugin.INSERT.equals(insertSpaceBetweenEmptyBracketsOption);
		}
		final Object insertSpaceBetweenEmptyParensInMethodDeclarationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_DECLARATION);
		if (insertSpaceBetweenEmptyParensInMethodDeclarationOption != null) {
			this.insert_space_between_empty_parens_in_method_declaration = IDEPlugin.INSERT.equals(insertSpaceBetweenEmptyParensInMethodDeclarationOption);
		}
		final Object insertSpaceBetweenEmptyParensInMethodInvocationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_INVOCATION);
		if (insertSpaceBetweenEmptyParensInMethodInvocationOption != null) {
			this.insert_space_between_empty_parens_in_method_invocation = IDEPlugin.INSERT.equals(insertSpaceBetweenEmptyParensInMethodInvocationOption);
		}
		final Object insertSpaceBetweenEmptyParensInExceptionSpecificationOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_EXCEPTION_SPECIFICATION);
		if (insertSpaceBetweenEmptyParensInExceptionSpecificationOption != null) {
			this.insert_space_between_empty_parens_in_exception_specification = IDEPlugin.INSERT.equals(insertSpaceBetweenEmptyParensInExceptionSpecificationOption);
		}
		final Object compactElseIfOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_COMPACT_ELSE_IF);
		if (compactElseIfOption != null) {
			this.compact_else_if = STPDefaultCodeFormatterConstants.TRUE.equals(compactElseIfOption);
		}
		final Object keepGuardianClauseOnOneLineOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_GUARDIAN_CLAUSE_ON_ONE_LINE);
		if (keepGuardianClauseOnOneLineOption != null) {
			this.keep_guardian_clause_on_one_line = STPDefaultCodeFormatterConstants.TRUE.equals(keepGuardianClauseOnOneLineOption);
		}
		final Object keepElseStatementOnSameLineOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_ELSE_STATEMENT_ON_SAME_LINE);
		if (keepElseStatementOnSameLineOption != null) {
			this.keep_else_statement_on_same_line = STPDefaultCodeFormatterConstants.TRUE.equals(keepElseStatementOnSameLineOption);
		}
		final Object keepEmptyInitializerListOnOneLineOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_EMPTY_INITIALIZER_LIST_ON_ONE_LINE);
		if (keepEmptyInitializerListOnOneLineOption != null) {
			this.keep_empty_initializer_list_on_one_line = STPDefaultCodeFormatterConstants.TRUE.equals(keepEmptyInitializerListOnOneLineOption);
		}
		final Object keepSimpleIfOnOneLineOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_SIMPLE_IF_ON_ONE_LINE);
		if (keepSimpleIfOnOneLineOption != null) {
			this.keep_simple_if_on_one_line = STPDefaultCodeFormatterConstants.TRUE.equals(keepSimpleIfOnOneLineOption);
		}
		final Object keepThenStatementOnSameLineOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_KEEP_THEN_STATEMENT_ON_SAME_LINE);
		if (keepThenStatementOnSameLineOption != null) {
			this.keep_then_statement_on_same_line = STPDefaultCodeFormatterConstants.TRUE.equals(keepThenStatementOnSameLineOption);
		}
		final Object numberOfEmptyLinesToPreserveOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_NUMBER_OF_EMPTY_LINES_TO_PRESERVE);
		if (numberOfEmptyLinesToPreserveOption != null) {
			try {
				this.number_of_empty_lines_to_preserve = Integer.parseInt((String) numberOfEmptyLinesToPreserveOption);
			} catch (NumberFormatException e) {
				this.number_of_empty_lines_to_preserve = 0;
			} catch (ClassCastException e) {
				this.number_of_empty_lines_to_preserve = 0;
			}
		}
		final Object joinWrappedLinesOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_JOIN_WRAPPED_LINES);
		if (joinWrappedLinesOption != null) {
			this.join_wrapped_lines = STPDefaultCodeFormatterConstants.TRUE.equals(joinWrappedLinesOption);
		}
		final Object putEmptyStatementOnNewLineOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_PUT_EMPTY_STATEMENT_ON_NEW_LINE);
		if (putEmptyStatementOnNewLineOption != null) {
			this.put_empty_statement_on_new_line = STPDefaultCodeFormatterConstants.TRUE.equals(putEmptyStatementOnNewLineOption);
		}
		final Object tabSizeOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_TAB_SIZE);
		if (tabSizeOption != null) {
			try {
				this.tab_size = Integer.parseInt((String) tabSizeOption);
			} catch (NumberFormatException e) {
				this.tab_size = 4;
			} catch (ClassCastException e) {
				this.tab_size = 4;
			}
		}
		final Object useTabsOnlyForLeadingIndentationsOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_USE_TABS_ONLY_FOR_LEADING_INDENTATIONS);
		if (useTabsOnlyForLeadingIndentationsOption != null) {
			this.use_tabs_only_for_leading_indentations = STPDefaultCodeFormatterConstants.TRUE.equals(useTabsOnlyForLeadingIndentationsOption);
		}
		final Object pageWidthOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_LINE_SPLIT);
		if (pageWidthOption != null) {
			try {
				this.page_width = Integer.parseInt((String) pageWidthOption);
			} catch (NumberFormatException e) {
				this.page_width = 80;
			} catch (ClassCastException e) {
				this.page_width = 80;
			}
		}
		final Object useTabOption = settings.get(STPDefaultCodeFormatterConstants.FORMATTER_TAB_CHAR);
		if (useTabOption != null) {
			if (IDEPlugin.TAB.equals(useTabOption)) {
				this.tab_char = TAB;
			} else if (IDEPlugin.SPACE.equals(useTabOption)) {
				this.tab_char = SPACE;
			} else {
				this.tab_char = MIXED;
			}
		}
	}

	public void setDefaultSettings() {
//		this.alignment_for_arguments_in_allocation_expression = STPAlignment.M_COMPACT_SPLIT;
		this.alignment_for_arguments_in_method_invocation = STPAlignment.M_COMPACT_SPLIT;
		this.alignment_for_assignment = STPAlignment.M_COMPACT_SPLIT;
		this.alignment_for_base_clause_in_type_declaration = STPAlignment.M_NEXT_PER_LINE_SPLIT;
		this.alignment_for_binary_expression = STPAlignment.M_COMPACT_SPLIT;
		this.alignment_for_compact_if = STPAlignment.M_COMPACT_SPLIT;
		this.alignment_for_conditional_expression = STPAlignment.M_COMPACT_FIRST_BREAK_SPLIT | STPAlignment.M_INDENT_ON_COLUMN;
		this.alignment_for_conditional_expression_chain = STPAlignment.M_COMPACT_SPLIT | STPAlignment.M_INDENT_ON_COLUMN;
		this.alignment_for_declarator_list = STPAlignment.M_COMPACT_SPLIT;
		this.alignment_for_enumerator_list = STPAlignment.M_ONE_PER_LINE_SPLIT;
		this.alignment_for_expressions_in_initializer_list = STPAlignment.M_COMPACT_SPLIT;
		this.alignment_for_member_access = STPAlignment.M_NO_ALIGNMENT;
		this.alignment_for_overloaded_left_shift_chain = STPAlignment.M_COMPACT_SPLIT;
		this.alignment_for_parameters_in_method_declaration = STPAlignment.M_COMPACT_SPLIT;
//		this.alignment_for_selector_in_method_invocation = STPAlignment.M_COMPACT_SPLIT;
		this.alignment_for_throws_clause_in_method_declaration = STPAlignment.M_COMPACT_SPLIT;
//		this.align_type_members_on_columns = false;
//		this.blank_lines_after_includes = 1;
//		this.blank_lines_before_field = 1;
//		this.blank_lines_before_first_class_body_declaration = 0;
//		this.blank_lines_before_includes = 1;
//		this.blank_lines_before_member_type = 1;
//		this.blank_lines_before_method = 1;
//		this.blank_lines_before_new_chunk = 1;
//		this.blank_lines_between_type_declarations = 1;
//		this.blank_lines_at_beginning_of_method_body = 0;
		this.brace_position_for_block = STPDefaultCodeFormatterConstants.END_OF_LINE;
		this.brace_position_for_block_in_case = STPDefaultCodeFormatterConstants.END_OF_LINE;
//		this.brace_position_for_enum_declaration = STPDefaultCodeFormatterConstants.END_OF_LINE;
		this.brace_position_for_initializer_list = STPDefaultCodeFormatterConstants.END_OF_LINE;
		this.brace_position_for_method_declaration = STPDefaultCodeFormatterConstants.END_OF_LINE;
		this.brace_position_for_namespace_declaration = STPDefaultCodeFormatterConstants.END_OF_LINE;
		this.brace_position_for_switch = STPDefaultCodeFormatterConstants.END_OF_LINE;
		this.brace_position_for_type_declaration = STPDefaultCodeFormatterConstants.END_OF_LINE;
		this.comment_min_distance_between_code_and_line_comment = 1;
		this.comment_preserve_white_space_between_code_and_line_comment = true;
		this.never_indent_line_comments_on_first_column = true;
//		this.comment_clear_blank_lines = false;
//		this.comment_format = true;
//		this.comment_format_header = false;
//		this.comment_format_html = true;
//		this.comment_format_source = true;
//		this.comment_indent_parameter_description = true;
//		this.comment_indent_root_tags = true;
//		this.comment_insert_empty_line_before_root_tags = true;
//		this.comment_insert_new_line_for_parameter = true;
//		this.comment_line_length = 80;
		this.continuation_indentation = 2;
		this.continuation_indentation_for_initializer_list = 2;
		this.indent_statements_compare_to_block = true;
		this.indent_statements_compare_to_body = true;
		this.indent_body_declarations_compare_to_namespace_header = false;
//		this.indent_body_declarations_compare_to_enum_declaration_header = true;
		this.indent_body_declarations_compare_to_access_specifier = true;
		this.indent_breaks_compare_to_cases = true;
		this.indent_empty_lines = false;
		this.indent_switchstatements_compare_to_cases = true;
		this.indent_switchstatements_compare_to_switch = false;
		this.indentation_size = 4;
		this.insert_new_line_after_opening_brace_in_initializer_list = false;
		this.insert_new_line_at_end_of_file_if_missing = false;
		this.insert_new_line_before_catch_in_try_statement = false;
		this.insert_new_line_before_closing_brace_in_initializer_list = false;
		this.insert_new_line_before_else_in_if_statement = false;
		this.insert_new_line_before_while_in_do_statement = false;
		this.insert_new_line_before_identifier_in_function_declaration = false;
		this.insert_new_line_in_empty_block = true;
//		this.insert_new_line_in_empty_method_body = true;
//		this.insert_new_line_in_empty_type_declaration = true;
		this.insert_space_after_assignment_operator = true;
		this.insert_space_after_binary_operator = true;
		this.insert_space_after_closing_angle_bracket_in_template_arguments = true;
		this.insert_space_after_closing_angle_bracket_in_template_parameters = true;
		this.insert_space_after_closing_paren_in_cast = true;
		this.insert_space_after_closing_brace_in_block = true;
		this.insert_space_after_colon_in_base_clause = true;
		this.insert_space_after_colon_in_case = true;
		this.insert_space_after_colon_in_conditional = true;
		this.insert_space_after_colon_in_labeled_statement = true;
//		this.insert_space_after_comma_in_allocation_expression = true;
		this.insert_space_after_comma_in_initializer_list = true;
		this.insert_space_after_comma_in_enum_declarations = true;
		this.insert_space_after_comma_in_method_invocation_arguments = true;
		this.insert_space_after_comma_in_method_declaration_parameters = true;
		this.insert_space_after_comma_in_method_declaration_throws = true;
		this.insert_space_after_comma_in_declarator_list = true;
		this.insert_space_after_comma_in_expression_list = true;
		this.insert_space_after_comma_in_base_types = true;
		this.insert_space_after_comma_in_template_arguments = true;
		this.insert_space_after_comma_in_template_parameters = true;
//		this.insert_space_after_ellipsis = true;
//		this.insert_space_after_opening_angle_bracket_in_parameterized_type_reference = false;
		this.insert_space_after_opening_angle_bracket_in_template_arguments = false;
		this.insert_space_after_opening_angle_bracket_in_template_parameters = false;
		this.insert_space_after_opening_bracket = false;
		this.insert_space_after_opening_brace_in_initializer_list = true;
		this.insert_space_after_opening_paren_in_cast = false;
		this.insert_space_after_opening_paren_in_catch = false;
		this.insert_space_after_opening_paren_in_for = false;
		this.insert_space_after_opening_paren_in_if = false;
		this.insert_space_after_opening_paren_in_method_declaration = false;
		this.insert_space_after_opening_paren_in_method_invocation = false;
		this.insert_space_after_opening_paren_in_parenthesized_expression = false;
		this.insert_space_after_opening_paren_in_switch = false;
		this.insert_space_after_opening_paren_in_while = false;
		this.insert_space_after_postfix_operator = false;
		this.insert_space_after_prefix_operator = false;
		this.insert_space_after_question_in_conditional = true;
		this.insert_space_after_semicolon_in_for = true;
		this.insert_space_after_unary_operator = false;
		this.insert_space_before_assignment_operator = true;
		this.insert_space_before_binary_operator = true;
		this.insert_space_before_closing_angle_bracket_in_template_arguments = false;
		this.insert_space_before_closing_angle_bracket_in_template_parameters = false;
		this.insert_space_before_closing_brace_in_initializer_list = true;
		this.insert_space_before_closing_bracket = false;
		this.insert_space_before_closing_paren_in_cast = false;
		this.insert_space_before_closing_paren_in_catch = false;
		this.insert_space_before_closing_paren_in_for = false;
		this.insert_space_before_closing_paren_in_if = false;
		this.insert_space_before_closing_paren_in_method_declaration = false;
		this.insert_space_before_closing_paren_in_method_invocation = false;
		this.insert_space_before_closing_paren_in_parenthesized_expression = false;
		this.insert_space_before_closing_paren_in_switch = false;
		this.insert_space_before_closing_paren_in_while = false;
		this.insert_space_before_colon_in_base_clause = false;
		this.insert_space_before_colon_in_case = false;
		this.insert_space_before_colon_in_conditional = true;
		this.insert_space_before_colon_in_default = false;
		this.insert_space_before_colon_in_labeled_statement = false;
//		this.insert_space_before_comma_in_allocation_expression = false;
		this.insert_space_before_comma_in_initializer_list = false;
		this.insert_space_before_comma_in_enum_declarations = false;
//		this.insert_space_before_comma_in_for_increments = false;
//		this.insert_space_before_comma_in_for_inits = false;
		this.insert_space_before_comma_in_method_invocation_arguments = false;
		this.insert_space_before_comma_in_method_declaration_parameters = false;
		this.insert_space_before_comma_in_method_declaration_throws = false;
		this.insert_space_before_comma_in_declarator_list = false;
		this.insert_space_before_comma_in_expression_list = false;
		this.insert_space_before_comma_in_base_types = false;
		this.insert_space_before_comma_in_template_arguments = false;
		this.insert_space_before_comma_in_template_parameters = false;
//		this.insert_space_before_ellipsis = false;
//		this.insert_space_before_parenthesized_expression_in_return = true;
		this.insert_space_before_opening_angle_bracket_in_template_arguments = false;
		this.insert_space_before_opening_angle_bracket_in_template_parameters = false;
		this.insert_space_before_opening_brace_in_initializer_list = true;
		this.insert_space_before_opening_brace_in_block = true;
		this.insert_space_before_opening_brace_in_method_declaration = true;
		this.insert_space_before_opening_brace_in_switch = true;
		this.insert_space_before_opening_brace_in_type_declaration = true;
		this.insert_space_before_opening_brace_in_namespace_declaration = true;
		this.insert_space_before_opening_bracket = false;
		this.insert_space_before_opening_paren_in_catch = true;
		this.insert_space_before_opening_paren_in_exception_specification = true;
		this.insert_space_before_opening_paren_in_for = true;
		this.insert_space_before_opening_paren_in_if = true;
		this.insert_space_before_opening_paren_in_method_invocation = false;
		this.insert_space_before_opening_paren_in_method_declaration = false;
		this.insert_space_before_opening_paren_in_switch = true;
		this.insert_space_before_opening_paren_in_parenthesized_expression = false;
		this.insert_space_before_opening_paren_in_while = true;
		this.insert_space_before_postfix_operator = false;
		this.insert_space_before_prefix_operator = false;
		this.insert_space_before_question_in_conditional = true;
		this.insert_space_before_semicolon = false;
		this.insert_space_before_semicolon_in_for = false;
		this.insert_space_before_unary_operator = false;
		this.insert_space_between_empty_braces_in_initializer_list = false;
		this.insert_space_between_empty_brackets = false;
		this.insert_space_between_empty_parens_in_method_declaration = false;
		this.insert_space_between_empty_parens_in_method_invocation = false;
		this.insert_space_between_empty_parens_in_exception_specification = false;
		this.compact_else_if = true;
		this.keep_guardian_clause_on_one_line = false;
		this.keep_else_statement_on_same_line = false;
		this.keep_empty_initializer_list_on_one_line = false;
		this.keep_simple_if_on_one_line = false;
		this.keep_then_statement_on_same_line = false;
		this.number_of_empty_lines_to_preserve = 1;
		this.join_wrapped_lines = true;
		this.put_empty_statement_on_new_line = true;
		this.tab_size = 4;
		this.page_width = 80;
		this.tab_char = TAB;
		this.use_tabs_only_for_leading_indentations = false;
	}
	
	/**
	 * Configure K&R style.
	 * <p>Example:</p>
	 * <pre>
	 * namespace foospace {
	 * int Foo() {
	 *     if (isBar) {
	 *         bar();
	 *         return 1;
	 *     } else
	 *         return 0;
	 * }
	 * }
	 * </pre>
	 * @see "http://en.wikipedia.org/wiki/Indent_style"
	 */
	public void setKandRSettings() {
		setDefaultSettings();
	}
	
	/**
	 * Configure BSD/Allman style.
	 * <p>Example:</p>
	 * <pre>
	 * namespace foospace
	 * {
	 * int Foo()
	 * {
	 *     if (isBar)
	 *     {
	 *         bar();
	 *         return 1;
	 *     }
	 *     else
	 *         return 0;
	 * }
	 * }
	 * </pre>
	 * @see "http://en.wikipedia.org/wiki/Indent_style"
	 */
	public void setAllmanSettings() {
		setDefaultSettings();
		this.brace_position_for_initializer_list = STPDefaultCodeFormatterConstants.NEXT_LINE;
		this.brace_position_for_block = STPDefaultCodeFormatterConstants.NEXT_LINE;
		this.brace_position_for_block_in_case = STPDefaultCodeFormatterConstants.NEXT_LINE;
//		this.brace_position_for_enum_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE;
		this.brace_position_for_method_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE;
		this.brace_position_for_type_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE;
		this.brace_position_for_namespace_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE;
		this.brace_position_for_switch = STPDefaultCodeFormatterConstants.NEXT_LINE;

		this.indent_statements_compare_to_block = true;
		this.indent_statements_compare_to_body = true;
		this.indent_body_declarations_compare_to_namespace_header = false;
//		this.indent_body_declarations_compare_to_enum_declaration_header = true;
		this.indent_breaks_compare_to_cases = true;
		this.indent_empty_lines = false;
		this.indent_switchstatements_compare_to_cases = true;
		this.indent_switchstatements_compare_to_switch = false;
		this.indentation_size = 4;

		this.insert_new_line_after_opening_brace_in_initializer_list = false;
		this.insert_new_line_at_end_of_file_if_missing = false;
		this.insert_new_line_before_closing_brace_in_initializer_list = false;
		this.insert_new_line_before_else_in_if_statement = true;
		this.insert_new_line_in_empty_block = true;
//		this.insert_new_line_in_empty_enum_declaration = true;
//		this.insert_new_line_in_empty_method_body = true;
//		this.insert_new_line_in_empty_type_declaration = true;

		this.compact_else_if = true;
		this.keep_guardian_clause_on_one_line = false;
		this.keep_else_statement_on_same_line = false;
		this.keep_empty_initializer_list_on_one_line = false;
		this.keep_simple_if_on_one_line = false;
		this.keep_then_statement_on_same_line = false;
		this.put_empty_statement_on_new_line = true;
		this.tab_size = 4;
		this.page_width = 80;
		this.tab_char = TAB;
		this.use_tabs_only_for_leading_indentations = false;
	}



	/**
	 * Configure GNU style.
	 * <p>Example:</p>
	 * <pre>
	 * namespace foospace
	 * {
	 *   int Foo()
	 *   {
	 *     if (isBar)
	 *       {
	 *         bar();
	 *         return 1;
	 *       }
	 *     else
	 *       return 0;
	 *   }
	 * }
	 * </pre>
	 * @see "http://en.wikipedia.org/wiki/Indent_style"
	 */
	public void setGNUSettings() {
		setDefaultSettings();
		this.brace_position_for_initializer_list = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
		this.brace_position_for_block = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
		this.brace_position_for_block_in_case = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
//		this.brace_position_for_enum_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
		this.brace_position_for_method_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE;
		this.brace_position_for_type_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE;
		this.brace_position_for_namespace_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE;
		this.brace_position_for_switch = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;

		this.indent_statements_compare_to_block = true;
		this.indent_statements_compare_to_body = true;
		this.indent_body_declarations_compare_to_namespace_header = true;
//		this.indent_body_declarations_compare_to_enum_declaration_header = true;
		this.indent_declaration_compare_to_template_header = true;
		this.indent_breaks_compare_to_cases = true;
		this.indent_empty_lines = false;
		this.indent_switchstatements_compare_to_cases = true;
		this.indent_switchstatements_compare_to_switch = false;
		this.indentation_size = 8;

		this.insert_new_line_after_opening_brace_in_initializer_list = false;
		this.insert_new_line_after_template_declaration = true;
		this.insert_new_line_at_end_of_file_if_missing = false;
		this.insert_new_line_before_catch_in_try_statement = true;
		this.insert_new_line_before_closing_brace_in_initializer_list = false;
		this.insert_new_line_before_else_in_if_statement = true;
		this.insert_new_line_before_identifier_in_function_declaration = true;
		this.insert_new_line_before_while_in_do_statement = true;
		this.insert_new_line_in_empty_block = true;
//		this.insert_new_line_in_empty_enum_declaration = false;
//		this.insert_new_line_in_empty_method_body = false;
//		this.insert_new_line_in_empty_type_declaration = false;

		this.insert_space_before_colon_in_base_clause = true;

		this.compact_else_if = true;
		this.keep_guardian_clause_on_one_line = false;
		this.keep_else_statement_on_same_line = false;
		this.keep_empty_initializer_list_on_one_line = false;
		this.keep_simple_if_on_one_line = false;
		this.keep_then_statement_on_same_line = false;
		this.put_empty_statement_on_new_line = true;
		this.tab_size = 2;
		this.page_width = 80;
		this.tab_char = SPACE;
		this.use_tabs_only_for_leading_indentations = false;
	}

	/**
	 * Configure Whitesmiths style.
	 * <p>Example:</p>
	 * <pre>
	 * namespace foospace
	 *     {
	 *     int Foo()
	 *         {
	 *         if (isBar)
	 *             {
	 *             bar();
	 *             return 1;
	 *             }
	 *         else
	 *             return 0;
	 *         }
	 *     }
	 * </pre>
	 * @see "http://en.wikipedia.org/wiki/Indent_style"
	 */
	public void setWhitesmitsSettings() {
		setDefaultSettings();
		this.alignment_for_expressions_in_initializer_list = STPAlignment.M_ONE_PER_LINE_SPLIT;
		this.alignment_for_enumerator_list = STPAlignment.M_ONE_PER_LINE_SPLIT | STPAlignment.M_FORCE;
		
		this.brace_position_for_initializer_list = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
		this.brace_position_for_block = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
		this.brace_position_for_block_in_case = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
		this.brace_position_for_method_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
		this.brace_position_for_type_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
		this.brace_position_for_namespace_declaration = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;
		this.brace_position_for_switch = STPDefaultCodeFormatterConstants.NEXT_LINE_SHIFTED;

		this.indent_statements_compare_to_block = false;
		this.indent_statements_compare_to_body = false;
		this.indent_body_declarations_compare_to_namespace_header = false;
		this.indent_breaks_compare_to_cases = true;
		this.indent_empty_lines = false;
		this.indent_switchstatements_compare_to_cases = true;
		this.indent_switchstatements_compare_to_switch = false;
		this.indentation_size = 4;

		this.insert_new_line_after_opening_brace_in_initializer_list = true;
		this.insert_new_line_at_end_of_file_if_missing = false;
		this.insert_new_line_before_catch_in_try_statement = true;
		this.insert_new_line_before_closing_brace_in_initializer_list = true;
		this.insert_new_line_before_else_in_if_statement = true;
		this.insert_new_line_before_while_in_do_statement = true;
		this.insert_new_line_in_empty_block = true;
//		this.insert_new_line_in_empty_enum_declaration = true;
//		this.insert_new_line_in_empty_method_body = true;
//		this.insert_new_line_in_empty_type_declaration = true;

		this.compact_else_if = true;
		this.keep_guardian_clause_on_one_line = false;
		this.keep_else_statement_on_same_line = false;
		this.keep_empty_initializer_list_on_one_line = false;
		this.keep_simple_if_on_one_line = false;
		this.keep_then_statement_on_same_line = false;
		this.put_empty_statement_on_new_line = true;
		this.tab_size = 8;
		this.page_width = 80;
		this.tab_char = MIXED;
		this.use_tabs_only_for_leading_indentations = false;
	}
}
