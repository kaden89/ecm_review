/**
 * Модель для документа Task
 * @author dkarachurin
 */
define([
    "dojo/_base/declare",
    "dojo/Stateful",
    "myApp/ecm/ui/utils/Utils"
], function (declare, Stateful, Utils) {
    var Task = declare("Task", [Stateful], {
        date: null,
        _dateSetter: function (value) {
            this.date = Utils.addTimezoneToDate(value);
        },
        dateOfIssue: null,
        _dateOfIssueSetter: function (value) {
            this.dateOfIssue = Utils.addTimezoneToDate(value);
        },
        deadline: null,
        _deadlineSetter: function (value) {
            this.deadline = Utils.addTimezoneToDate(value);
        }
    });
    //static field
    Task.columns = [
        {id: 'id', field: 'id', name: 'id', width: '5%'},
        {id: 'name', field: 'name', name: 'Name', width: '9.5%'},
        {id: 'author.fullname', field: 'authorName', name: 'Author', width: '13.5%'},
        {id: 'executor.fullname', field: 'executorName', name: 'Executor', width: '13.5%'},
        {id: 'controller.fullname', field: 'controllerName', name: 'Controller', width: '13.5%'},
        {id: 'isControlled', field: 'isControlled', name: 'Is controlled', width: '5%'},
        {id: 'regNumber', field: 'regNumber', name: 'Reg number', width: '5%'},
        {id: 'date', field: 'date', name: 'Date', width: '5%'},
        {id: 'dateOfIssue', field: 'dateOfIssue', name: 'Date of issue', width: '5%'},
        {id: 'deadline', field: 'deadline', name: 'Deadline', width: '5%'},
        {id: 'text', field: 'text', name: 'Text', width: '20%'}
    ];
    Task.tableName = "Tasks";

    return Task;
})